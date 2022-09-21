package com.example.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
