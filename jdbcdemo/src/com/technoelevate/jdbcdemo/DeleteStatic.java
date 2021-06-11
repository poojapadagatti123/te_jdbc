package com.technoelevate.jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DeleteStatic {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt=null;
		
		
		
//		load and register the driver
		
		
		
		
		
//		create connection 
	 try {
		String dburl="jdbc:mysql://localhost:3306/employee_info";
		con=DriverManager.getConnection(dburl, "j2ee","root" );
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
		
//		execute query
     String query3 ="delete from department where dept_id=126";
	
	try {
		stmt=con.createStatement();
		int n3=stmt.executeUpdate(query3);
		
		if(n3!=0) {
			System.out.println(n3+  "row deleted successfull");
		}
	  } catch (SQLException e) {
		e.printStackTrace();
		
//		close jdbc objects
	}	finally {
			try {
				if(con!=null) {
				con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	}
	}
