package com.soprasteria.bestof.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "continents")
public class Continent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int continent_id;
	private String name;
	
	public int getContinent_id() {
		return continent_id;
	}
	public void setContinent_id(int continent_id) {
		this.continent_id = continent_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@OneToMany
    @JoinColumn(name = "continent", nullable = false)
    private List<Region> region;
	
}
