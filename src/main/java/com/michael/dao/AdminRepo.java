package com.michael.dao;

import org.springframework.data.repository.CrudRepository;

import com.michael.model.Admin;

public interface AdminRepo extends CrudRepository<Admin,Integer > {
	Admin findByUsername(String username);

}
