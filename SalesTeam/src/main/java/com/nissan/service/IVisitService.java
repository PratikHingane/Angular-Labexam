package com.nissan.service;


import java.util.List;
import com.nissan.model.Visit;

public interface IVisitService {

	//Add visit
		public Visit addVisit(Visit visit);
		
	//list all visits
		public List<Visit> getAllVisit();
}
