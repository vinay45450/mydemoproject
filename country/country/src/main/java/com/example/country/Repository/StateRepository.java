package com.example.country.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.country.bean.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
