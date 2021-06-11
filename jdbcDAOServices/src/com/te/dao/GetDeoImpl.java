package com.te.dao;

public class GetDeoImpl {

	
	String type ="jdbc";
	public EmployeeDAO getDeoImpl () {
		
		if(type.equalsIgnoreCase("jdbc")) {
		 return new EmoloyeeDAOJdbcImp();
		}else if(type.equalsIgnoreCase("hybernate")) {
			return new EmployeeHiberImp();
		}else if(type.equalsIgnoreCase("spring")) {
			return new EmployeeDaoSpringImp();
		}
		
	
	return null;
	
	}
	
	
	
}
