package com.michael.dao;

import org.springframework.data.repository.CrudRepository;

import com.michael.model.Blood;

public interface BloodRepo extends CrudRepository<Blood,String > {
	
}
