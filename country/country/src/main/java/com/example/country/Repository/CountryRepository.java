package com.example.country.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.country.bean.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
