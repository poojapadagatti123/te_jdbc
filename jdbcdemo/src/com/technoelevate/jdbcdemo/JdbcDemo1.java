package com.technoelevate.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.jdbc.Driver;

public class JdbcDemo1 {

	public static void main(String[] args) {
   Connection con=null;
   ResultSet rs=null;
   Statement stmt=null;
		
//	load and register the driver
		
		try {
//			com.mysql.jdbc.Driver driver=new com.mysql.jdbc.Driver();
//			Driver driver =new Driver();
//			DriverManager.registerDriver(driver);
		
            Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		get connection via driver
		try {
			String dburl="jdbc:mysql://localhost:3306/employee_info?"
					+"user=j2ee&password=root";
            con =DriverManager.getConnection(dburl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
//		issue sql queries via connection
		 try {
		    String query ="select * from department;";

			 stmt=con.createStatement();
			 rs=stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
//		 get result set and fetch data using result set
		 
		 try {
			while(rs.next()) {
				 System.out.println(rs.getInt("dept_id"));
				 System.out.println(rs.getString("dept_name"));
				 System.out.println(rs.getString("location"));
			 }
		} catch (SQLException e) {
			e.printStackTrace();
			
			
//			close all the resources....	 
		}finally {
			
				try {
					if(con!=null) {
					con.close();
					}
					if(stmt!=null) {
						stmt.close();
					}
					if(rs!=null) {
						rs.close();
					}
						
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
		
	}

