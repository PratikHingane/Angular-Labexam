package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IEmployeeDAO;

import com.nissan.model.EmployeeRegistration;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO employeedao;
	@Override
	public EmployeeRegistration addEmployee(EmployeeRegistration employeeRegistration) {
		// TODO Auto-generated method stub
		return employeedao.save(employeeRegistration);
	}

	@Override
	public List<EmployeeRegistration> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}

	@Override
	public EmployeeRegistration getByEmpId(Integer empId) {
		// TODO Auto-generated method stub
		return employeedao.findById(empId).get();
	}

}
