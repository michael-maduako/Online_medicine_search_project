package com.michael.dao;

import org.springframework.data.repository.CrudRepository;

import com.michael.model.Medicine;

public interface MedicineRepo extends CrudRepository<Medicine,Integer > {
	
}
