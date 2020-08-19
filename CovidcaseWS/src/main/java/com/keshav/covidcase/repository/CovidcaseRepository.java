package com.keshav.covidcase.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.keshav.covidcase.model.Covidcase;

@Repository
public interface CovidcaseRepository extends MongoRepository<Covidcase, String> {

}
