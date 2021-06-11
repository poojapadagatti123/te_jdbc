package com.te.service;

import com.te.bean.EmployeeData;

public class MainService {

	public static void main(String[] args) {
  
	EmployeeServiceImp  esi=new EmployeeServiceImp();
	EmployeeData emp =esi.getSingleRecord(10);
		
	System.out.println(emp.getDept_id());
	System.out.println(emp.getDept_name());
	System.out.println(emp.getLocation());
	
	
	
	
	
	}


}
