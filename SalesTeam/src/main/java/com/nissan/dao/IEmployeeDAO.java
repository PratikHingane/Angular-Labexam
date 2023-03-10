package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.EmployeeRegistration;

@Repository
public interface IEmployeeDAO extends JpaRepositoryImplementation<EmployeeRegistration, Integer> {

	
}
