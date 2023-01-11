package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.EmployeeRegistration;
import com.nissan.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class EmployeeController {

	@Autowired
	IEmployeeService employeeservice;
	
	
	@GetMapping("employees")
	public List<EmployeeRegistration> getAllEmployee(){
		return employeeservice.getAllEmployee();
	}
	
	@PostMapping("employees")
	public EmployeeRegistration addEmployee(@RequestBody EmployeeRegistration employeeRegistration) {
		return employeeservice.addEmployee(employeeRegistration);
	}
	
	@GetMapping("employees/{_empId}")
	public EmployeeRegistration getByEmpId(@PathVariable Integer _empId) {
		return employeeservice.getByEmpId(_empId);
	}
	
}
