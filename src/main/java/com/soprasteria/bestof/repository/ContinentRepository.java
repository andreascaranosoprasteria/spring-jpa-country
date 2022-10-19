package com.soprasteria.bestof.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.soprasteria.bestof.model.Continent;

@Repository
public interface ContinentRepository extends CrudRepository<Continent,Integer>{
	public List<Continent> findAll();
	
}
