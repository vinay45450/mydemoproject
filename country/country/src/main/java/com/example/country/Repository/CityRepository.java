package com.example.country.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.country.bean.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
