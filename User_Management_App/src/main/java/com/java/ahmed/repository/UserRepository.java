package com.java.ahmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ahmed.entity.UserDtls;

public interface UserRepository extends JpaRepository<UserDtls , Integer> {

	public boolean existsByEmail(String email);

	public UserDtls findByEmail(String email);

}