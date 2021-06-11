package com.technoelevate.jdbcdemo;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class SelectStatic {

	public static void main(String[] args) {
		  Employee emp=new Employee();
			Connection con=null;
			Statement stmt =null;
			ResultSet rs=null;
			
			try {
				
				FileInputStream file=new FileInputStream("properties.properties");
				Properties p=new Properties();
				p.load(file);
				con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pw"));
				
				String query ="select * from department where dept_id=10";

			   	stmt =con.createStatement();
			     rs=stmt.executeQuery(query);

			
			     while(rs.next()) {
			     emp.setDept_id(rs.getInt("dept_id"));
			     emp.setDept_name(rs.getString("dept_name"));
			     emp.setLocation(rs.getString("location"));
			     }
			     
			} catch (Exception e) {
			}
			
			System.out.println(emp.dept_id+"  "+emp.dept_name+"   "+emp.location);
			
			
			
}
}


