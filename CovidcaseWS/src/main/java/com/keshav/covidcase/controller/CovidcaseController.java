package com.keshav.covidcase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.covidcase.service.CovidcaseService;
import com.keshav.covidcase.model.Covidcase;

@RestController
@RequestMapping("/covidcase")
public class CovidcaseController {

	@Autowired
	CovidcaseService covidcaseservice;
	
	@GetMapping("/")
	public List<Covidcase> getAll() {
		return covidcaseservice.getAll();
	}
}
