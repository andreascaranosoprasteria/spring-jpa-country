package com.soprasteria.bestof.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.bestof.model.Continent;
import com.soprasteria.bestof.repository.ContinentRepository;

@RestController
@RequestMapping("/api")	
public class ContinentController {
	@Autowired
	private ContinentRepository continentRepository;

	@GetMapping("/continent")
	public List<Continent>getContinents(){
		return (List<Continent>)continentRepository.findAll();
	}
}
