package com.soprasteria.bestof.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soprasteria.bestof.model.Continent;
import com.soprasteria.bestof.model.Region;

public interface RegionRepository extends CrudRepository<Region,Integer>{
	public List<Region> findAll();
}
