package com.technoelevate.jdbcdynamic;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class SelectDynamic {

	public static void main(String[] args) {
       
		Connection con=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		
		try {
			
			FileInputStream file=new FileInputStream("properties.properties");
			Properties p=new Properties();
			p.load(file);
			con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pw"));
			
			
			
			String query ="select * from department where dept_id=?";

			psmt =con.prepareStatement(query);
			psmt.setInt(1, Integer.parseInt(args[0]));
		     rs=psmt.executeQuery();

		
		     while(rs.next()) {
		    
		    	 System.out.println(rs.getInt("dept_id"));
		    	 System.out.println(rs.getString("dept_name"));

		    	 System.out.println(rs.getString("location"));

		     }
		     
		} catch (Exception e) {
		}
		
		finally {
			
			try {
				if(con!=null) {
					con.close();
				}
				if(psmt!=null) {
					psmt.close();
				}if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

	}
}
