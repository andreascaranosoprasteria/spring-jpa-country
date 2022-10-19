package com.soprasteria.bestof.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.bestof.model.Region;
import com.soprasteria.bestof.repository.RegionRepository;


@RestController
@RequestMapping("/api")	
public class RegionController {
	@Autowired
	private RegionRepository regionRepository;

	@GetMapping("/region")
	public List<Region> getRegions(){
		return (List<Region>)regionRepository.findAll();
	}
}