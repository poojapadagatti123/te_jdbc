package com.technoelevate.jdbcdynamic;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DeleteDynamic {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement psmt=null;
		
		try {
			
			FileInputStream file=new FileInputStream("properties.properties");
			Properties p=new Properties();
			p.load(file);
			con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pw"));
			
			
			String query ="delete  from department where dept_id=?";
			psmt =con.prepareStatement(query);
			psmt.setInt(1, Integer.parseInt(args[0]));
		    int exe=psmt.executeUpdate();

		    
	        if(exe!=0) {
	        	System.out.println(exe+"  rows deleted succefully");
	        }    
		    
		} catch (Exception e) {
		}	finally {
			
			try {
				if(con!=null) {
					con.close();
				}
				if(psmt!=null) {
					psmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	}
}


