package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nissan.dao.IVisitDAO;
import com.nissan.model.Visit;

@Service
public class VisitServiceImpl implements IVisitService {

	@Autowired
	IVisitDAO visitdao;
	
	@Override
	public Visit addVisit(Visit visit) {
		
		return visitdao.save(visit);
		
	}

	@Override
	public List<Visit> getAllVisit() {
		// TODO Auto-generated method stub
		return visitdao.findAll();
	}

}
