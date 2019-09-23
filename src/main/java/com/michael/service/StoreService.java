package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.model.Store;
import com.michael.repository.StoreRepo;

@Service
public class StoreService {
	@Autowired
	private StoreRepo userRepo;
	
	
	
	
	//Returns a list of every user
	public List<Store> getAllStores(){
		System.out.println(userRepo);
		return (List<Store>)userRepo.findAll();
	}
	
	public void addStore(Store user) {
		userRepo.save(user);
	}
	
	public Optional<Store> getStoreById(long id) {
		// optional handles nullpointerexceptions
		return userRepo.findById(id);
	}
	
	public void updateById(Store store,long id) {
		store.setId(id);
		userRepo.save(store);
	}
	
	public void deleteStoreById(long id) {
		 userRepo.deleteById(id);
	}
	
}
