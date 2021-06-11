package com.te.dao;

import com.te.bean.EmployeeData;

public class EmployeeDaoSpringImp  implements EmployeeDAO{

	@Override
	public EmployeeData getSingleRecord(int id) {
    System.out.println("spring implmentation");
		
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("get the all records of employee using spring");
	}

	@Override
	public void insertRecord(EmployeeData a) {
		System.out.println("inserted records of employee using spring");
	}

}
