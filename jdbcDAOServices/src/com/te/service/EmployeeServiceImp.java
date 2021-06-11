package com.te.service;

import com.te.bean.EmployeeData;
import com.te.dao.EmployeeDAO;
import com.te.dao.GetDeoImpl;

public class EmployeeServiceImp implements EmployeeService{

	GetDeoImpl daoImpl=new GetDeoImpl();
	EmployeeDAO dao=daoImpl.getDeoImpl();

	@Override
	public EmployeeData getSingleRecord(int id) {
     if(id<0) {
	  return null;
  }else {
	  System.out.println("employee service layer");
	  return dao.getSingleRecord(id);
  }
		
		
	}
	@Override
	public void getAllRecords() {
		System.out.println("fetching all the records");
	}
	@Override
	public void insertRecord(EmployeeData a) {
		System.out.println("inserted");
	}


	
}
