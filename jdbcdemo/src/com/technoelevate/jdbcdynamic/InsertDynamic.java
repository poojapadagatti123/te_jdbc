package com.technoelevate.jdbcdynamic;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class InsertDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement psmt=null;
		
		try {
			
			FileInputStream file=new FileInputStream("properties.properties");
			Properties p=new Properties();
			p.load(file);
			con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pw"));
			
			
			
			String query ="insert into department values(?,?,?)";

			psmt =con.prepareStatement(query);
			psmt.setInt(1, Integer.parseInt(args[0]));
			psmt.setString(2, args[1]);
			psmt.setString(3, args[2]);

		    int rs=psmt.executeUpdate();

	        if(rs!=0) {
	        	System.out.println(rs+"  rows inserted succefully");
	        }
		    
		    
		    
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			
			try {
				if(con!=null) {
					con.close();
				}
				if(psmt!=null) {
					psmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
