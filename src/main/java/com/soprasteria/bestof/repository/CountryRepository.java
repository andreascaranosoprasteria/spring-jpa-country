package com.soprasteria.bestof.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soprasteria.bestof.model.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country,Integer>{

	public List<Country> findAll();
	
}
