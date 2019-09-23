package com.michael.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.model.Store;

@Repository
public interface StoreRepo extends CrudRepository<Store, Long>{

}
