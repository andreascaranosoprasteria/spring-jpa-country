package com.soprasteria.bestof.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.bestof.model.Country;
import com.soprasteria.bestof.repository.CountryRepository;

@RestController
@RequestMapping("/api")	
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;

	@GetMapping("/country")
	public List<Country>getCountries(){
		return (List<Country>)countryRepository.findAll();
	}

}
