package com.nissan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Visit {

	//declare the fields
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer visitId;
	private String custName;
	private String contPerson;
	private Integer contactNo;
	private String interestProduct;
	private String visitSubject;
	private String description;
	private Date visitDate;
	private Boolean isDisabled;
	private Boolean isDeleted;
	
	
	private Integer empId;
	@JoinColumn(name="empId",insertable=false,updatable=false)
	@OneToOne //(mappedBy="user",cascade=CascadeType.ALL)
	private EmployeeRegistration employeeregistration;
	
	public Visit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visit(Integer visitId, String custName, String contPerson, Integer contactNo, String interestProduct,
			String visitSubject, String description, Date visitDate, Boolean isDisabled, Boolean isDeleted,
			Integer empId) {
		super();
		this.visitId = visitId;
		this.custName = custName;
		this.contPerson = contPerson;
		this.contactNo = contactNo;
		this.interestProduct = interestProduct;
		this.visitSubject = visitSubject;
		this.description = description;
		this.visitDate = visitDate;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
	}

	public Integer getVisitId() {
		return visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContPerson() {
		return contPerson;
	}

	public void setContPerson(String contPerson) {
		this.contPerson = contPerson;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public String getInterestProduct() {
		return interestProduct;
	}

	public void setInterestProduct(String interestProduct) {
		this.interestProduct = interestProduct;
	}

	public String getVisitSubject() {
		return visitSubject;
	}

	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public Boolean getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	
}
