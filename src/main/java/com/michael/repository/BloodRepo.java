package com.michael.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.model.Blood;
@Repository
public interface BloodRepo extends CrudRepository<Blood,Long > {
	
}
