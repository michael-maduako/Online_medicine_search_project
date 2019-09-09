package com.michael.dao;

import org.springframework.data.repository.CrudRepository;

import com.michael.model.Store;

public interface StoreRepo extends CrudRepository<Store,Integer > {
	
}
