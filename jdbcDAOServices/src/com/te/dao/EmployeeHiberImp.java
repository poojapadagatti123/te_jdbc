package com.te.dao;

import com.te.bean.EmployeeData;

public class EmployeeHiberImp implements EmployeeDAO{

	@Override
	public EmployeeData getSingleRecord(int id) {
     System.out.println("hibernate implementation");
		
		return null;
	}

	@Override
	public void getAllRecords() {
		System.out.println("get the all records using hiber");
	}

	@Override
	public void insertRecord(EmployeeData a) {
	System.out.println("inserted records using hiber");	
	}

}
