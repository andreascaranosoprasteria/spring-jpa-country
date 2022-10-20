package com.soprasteria.bestof.controller;

import java.util.List;
/*
	2) un metodo per inserire una nuova nazione
	3) un metodo per modificare una nazione esistente, dato il suo id
	4) un medodo per eliminare una nazione
 */
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/country/{countryId}")
    public Country getCountryById(@PathVariable(value = "countryId") int countryId) {
        Optional<Country> c = countryRepository.findById(countryId);
        if (c.isPresent())
            return c.get();
        else
            return new Country();
    }
	
	//MODIFICA DATO L' ID
		@PutMapping("country/modifica/{id}")
		public Optional<Country> replaceCountry(@RequestBody Country newCountry, @PathVariable int countryId) {
			return countryRepository.findById(countryId)
					.map(country -> {
						country.setName("AGGIUNTA");
						return countryRepository.save(country);
					});
		}
		
}
