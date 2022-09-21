package com.example.country.Controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.country.Repository.CityRepository;
import com.example.country.Repository.CountryRepository;
import com.example.country.Repository.StateRepository;
import com.example.country.bean.City;
import com.example.country.bean.Country;
import com.example.country.bean.State;

@RestController
public class CountryController {

	@Autowired
	CountryRepository countryrepository;

	@Autowired
	StateRepository Staterepository;

	@Autowired
	CityRepository cityrepository;
	
	@GetMapping("get/allcountries")
	public List<Country> getAllCountry()
	{
		return countryrepository.findAll();
	}

	@PostMapping("savecountry/state/city")
	public void saveCountry(@RequestBody Country con) {
	
		
	   countryrepository.save(con);
	   
		
    }
	
//	@GetMapping("get/citybyId/{city_Id}")
//	public Addresponse getCityById(@PathVariable int city_Id)
//	{
//		City city=cityrepository.findById(city_Id).get();
//		
//		 State state= city.getState();
//			int st1 = state.getState_Id();
//			String st2=state.getState_Name();
//			
//			Country country = state.getCountry();
//			int coun1= country.getCountry_Id();
//		      String coun2 =country.getCountry_Name();
//		       
//		       Addresponse res=new Addresponse();
//		      res.setCountry_Id(coun1);
//		      res.setCountry_Name(coun2);
//		      res.setState_Id(st1);
//		    res.setState_Name(st2);
//		    
//		    return res;
//		       
//	}
	
   @GetMapping("get/cityByName/{city_Name}")
	public Addresponse getCityByName(@PathVariable String city_Name)
	{
		
	   List<City> newcities = cityrepository.findAll();
	   
	          Iterator<City> itrcity = newcities.iterator();
	          
	          while(itrcity.hasNext())
	          {
	        	   City city1 = itrcity.next();
	                   boolean cityname = city1.getCity_Name().equals(city_Name);
	                   
	                   
	                   State state= city1.getState();
	       			int st1 = state.getState_Id();
	       			String st2=state.getState_Name();
	       			
	       			Country country = state.getCountry();
	       			int coun1= country.getCountry_Id();
	       		      String coun2 =country.getCountry_Name();
	       		       
	       		       Addresponse res=new Addresponse();
	       		      res.setCountry_Id(coun1);
	       		      res.setCountry_Name(coun2);
	       		      res.setState_Id(st1);
	       		    res.setState_Name(st2);
	       		    
	       		    return res;  
	          }      
	           
			return null;
	   }
   
   
   


}



