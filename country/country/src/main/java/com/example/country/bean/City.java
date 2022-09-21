package com.example.country.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="city_Id")
	private int city_Id;
	

	@Column(name="city_Name")
	private String city_Name;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private State state;
	
	

	public City(int city_Id, String city_Name, State state) {
		super();
		this.city_Id = city_Id;
		this.city_Name = city_Name;
		this.state = state;
	}



	public City() {
		
	}



	public int getCity_Id() {
		return city_Id;
	}



	public void setCity_Id(int city_Id) {
		this.city_Id = city_Id;
	}



	public String getCity_Name() {
		return city_Name;
	}



	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}



	public State getState() {
		return state;
	}



	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
