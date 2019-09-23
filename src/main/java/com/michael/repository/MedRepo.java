package com.michael.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.model.Med;

@Repository
public interface MedRepo extends CrudRepository<Med, Long>{
	
}
