package com.example.country.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="state_Id")
	private int state_Id;
	

	@Column(name="state_Name")
    private String state_Name;
	

	@Column(name="state_Capital")
	private String state_Capital;
	
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private Country country;
	
	
	@OneToMany(mappedBy = "state",cascade = CascadeType.ALL)
	private List<City> allcity;


	public State(int state_Id, String state_Name, String state_Capital, Country country, List<City> allcity) {
		super();
		this.state_Id = state_Id;
		this.state_Name = state_Name;
		this.state_Capital = state_Capital;
		this.country = country;
		this.allcity = allcity;
	}


	public State() {
		super();
	}


	public int getState_Id() {
		return state_Id;
	}


	public void setState_Id(int state_Id) {
		this.state_Id = state_Id;
	}


	public String getState_Name() {
		return state_Name;
	}


	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}


	public String getState_Capital() {
		return state_Capital;
	}


	public void setState_Capital(String state_Capital) {
		this.state_Capital = state_Capital;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	public List<City> getAllcity() {
		return allcity;
	}


	public void setAllcity(List<City> allcity) {
		this.allcity = allcity;
	}
	
	
	
	
	
	
}
