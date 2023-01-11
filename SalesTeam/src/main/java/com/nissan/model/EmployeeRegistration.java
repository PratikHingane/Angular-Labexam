package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeRegistration {

	//declare the fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	private String firstName;
	
	//default constructor
	public EmployeeRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterize constructor
	public EmployeeRegistration(Integer empId, String firstName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
	}
	
	//getters and setters
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//toString method
	@Override
	public String toString() {
		return "EmployeeRegistration [empId=" + empId + ", firstName=" + firstName + "]";
	}
	
	
}
