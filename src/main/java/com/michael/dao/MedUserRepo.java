package com.michael.dao;

import org.springframework.data.repository.CrudRepository;

import com.michael.model.MedUser;

public interface MedUserRepo extends CrudRepository<MedUser,Integer > {
	
}
