package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.dao.StoreRepo;
import com.michael.model.Store;

@Service // (( Holds the business logic and users))
public class StoreService {
	@Autowired
	private StoreRepo userRepo;

	public List<Store> retrieveAllStores() {
		userRepo.findAll().forEach(System.out::println);
		return (List<Store>)userRepo.findAll();
	}

	
	
	public Optional<Store> getStoreById(int id) {
		// optional handles nullpointerexceptions
		return userRepo.findById(id);
	}

	public void addStore(Store store) {
		userRepo.save(store);
	}
	
	public void deleteStoreById(Store store) {
		userRepo.deleteById(store.getMedStoreid());
	}
	
	public void deleteAllStores() {
		userRepo.deleteAll();
	}
	

	public void updateStoreById(Store store) {
		userRepo.save(store);
		
	}
	
}
