 package com.keshav.covidcase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keshav.covidcase.model.Covidcase;
import com.keshav.covidcase.repository.CovidcaseRepository;

@Service
public class CovidcaseService {
	@Autowired
	CovidcaseRepository covidcaseRepository;

	public List<Covidcase> getAll() {
		// TODO Auto-generated method stub
		return 	covidcaseRepository.findAll();
	}
}
