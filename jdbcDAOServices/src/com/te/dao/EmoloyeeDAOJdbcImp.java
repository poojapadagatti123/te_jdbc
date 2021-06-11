package com.te.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.te.bean.EmployeeData;

public class EmoloyeeDAOJdbcImp implements EmployeeDAO{

	@Override
	public EmployeeData getSingleRecord(int id) {
		
		
		EmployeeData empData=new EmployeeData();

         try {	
			   String dburl="jdbc:mysql://localhost:3306/employee_info";
			   Connection 	con = DriverManager.getConnection(dburl,"j2ee", "root");
			   Statement stmt =con.createStatement();
			    
			    String query="select * from department where dept_id="+id+";";
			    ResultSet rs=stmt.executeQuery(query);
			  
			
			    while(rs.next()) {
			    	empData.setDept_id(rs.getInt("dept_id"));
			    	empData.setDept_name(rs.getString("dept_name"));
			    	empData.setLocation(rs.getString("location"));
			    }

           } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return empData;
	}

	@Override
	public void getAllRecords() {
		System.out.println("getting all the records");
		
		
	}

	@Override
	public void insertRecord(EmployeeData a) {
		System.out.println("inserting records");
		
		
	}
	
}