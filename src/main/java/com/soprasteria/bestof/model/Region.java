package com.soprasteria.bestof.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "regions")
public class Region {
	private int region_id;
	private String name;
	private int continent_id;
	
	@OneToMany(mappedBy = "region")
    private List<Country> countries;
	
	
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContinent_id() {
		return continent_id;
	}
	public void setContinent_id(int continent_id) {
		this.continent_id = continent_id;
	}
}
