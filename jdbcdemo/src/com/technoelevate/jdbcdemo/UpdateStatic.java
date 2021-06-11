package com.technoelevate.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatic {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
	
//		load and register the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
//		create connection 
	 try {
			String dburl="jdbc:mysql://localhost:3306/employee_info";
		con=DriverManager.getConnection(dburl, "j2ee","root" );
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
		
	 
//		execute query
	 String query3 ="update  department set  location ='mangalur' where  dept_id=10";
	
	 
	try {
		stmt=con.createStatement();
		int n3=stmt.executeUpdate(query3);
		if(n3!=0) {
			System.out.println(n3+  "row updated successfull");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
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
