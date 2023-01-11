package com.nissan.service;

import java.util.List;

import com.nissan.model.EmployeeRegistration;



public interface IEmployeeService {

	//Add Employee
	public EmployeeRegistration addEmployee(EmployeeRegistration employeeRegistration);
	
	//Get list of employees
	public List<EmployeeRegistration> getAllEmployee();
	
	//get employee by Id
	public EmployeeRegistration getByEmpId(Integer empId);
}
