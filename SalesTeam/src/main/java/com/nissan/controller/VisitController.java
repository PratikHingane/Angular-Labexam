package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Visit;
import com.nissan.service.IVisitService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class VisitController {

	@Autowired
	IVisitService visitservice;
	
	@GetMapping("visits")
	public List<Visit> getAllVisit(){
		return visitservice.getAllVisit();
	}
	
	@PostMapping("visits")
	public Visit addVisit(@RequestBody Visit visit) {
		return visitservice.addVisit(visit);
	}
}
