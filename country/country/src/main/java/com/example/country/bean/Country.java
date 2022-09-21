package com.example.country.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="country_Id")
	private int country_Id;
	
	@Column(name="country_Name")
	private String country_Name;
	
	@Column(name="country_Capital")
	private String country_Capital;
	
	
	@OneToMany(mappedBy = "country",cascade = CascadeType.ALL)
	private List<State> allState;


	public Country(int country_Id, String country_Name, String country_Capital, List<State> allState) {
		super();
		this.country_Id = country_Id;
		this.country_Name = country_Name;
		this.country_Capital = country_Capital;
		this.allState = allState;
	}


	public Country() {
		
	}


	public int getCountry_Id() {
		return country_Id;
	}


	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}


	public String getCountry_Name() {
		return country_Name;
	}


	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}


	public String getCountry_Capital() {
		return country_Capital;
	}


	public void setCountry_Capital(String country_Capital) {
		this.country_Capital = country_Capital;
	}


	public List<State> getAllState() {
		return allState;
	}


	public void setAllState(List<State> allState) {
		this.allState = allState;
	}
	
	
	
}


