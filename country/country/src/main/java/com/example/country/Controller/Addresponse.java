package com.example.country.Controller;

import com.example.country.bean.City;

public class Addresponse {
	
	
	private int country_Id;
	
	private String country_Name;
	
	private int state_Id;
	
	private String state_Name;

	public Addresponse(int country_Id, String country_Name, int state_Id, String state_Name) {
		super();
		this.country_Id = country_Id;
		this.country_Name = country_Name;
		this.state_Id = state_Id;
		this.state_Name = state_Name;
	}

	public Addresponse() {
		super();
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
	
	
	

}
