package com.technoelevate.jdbcdemo;

import java.sql.*;

public class InsertStatic {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;
//		load and register the driver
		
		
		
		
		
//		create connection 
	 try {
			String dburl="jdbc:mysql://localhost:3306/employee_info";
		con=DriverManager.getConnection(dburl, "j2ee","root" );
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
//		execute query
	 
//	 String query ="insert into department values(60,'webdeveloper','hubli');";
//	 String query1 ="insert into department values(70,'tester','benglore');";
//	 String query2 ="insert into department values(80,'developer','channai');";
	 String query3 ="insert into department values(126,'devops','goa')";
	
	try {
		stmt=con.createStatement();
//		int n=stmt.executeUpdate(query);
//		int n1=stmt.executeUpdate(query1);
//		int n2=stmt.executeUpdate(query2);
		int n3=stmt.executeUpdate(query3);
		
		
		if(n3!=0) {
			System.out.println("inserted successfull"+n3);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		
	}


