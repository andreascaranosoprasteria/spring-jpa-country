package com.soprasteria.bestof.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "country")
public class Country {
	private int country_id;
	private String name;
	private BigDecimal area;
	private LocalDate national_day;
	private char country_code2;
	private char country_code3;
	private int region_id;
	
	@ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
	
	
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	public LocalDate getNational_day() {
		return national_day;
	}
	public void setNational_day(LocalDate national_day) {
		this.national_day = national_day;
	}
	public char getCountry_code2() {
		return country_code2;
	}
	public void setCountry_code2(char country_code2) {
		this.country_code2 = country_code2;
	}
	public char getCountry_code3() {
		return country_code3;
	}
	public void setCountry_code3(char country_code3) {
		this.country_code3 = country_code3;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
}