package com.michael.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Store;
import com.michael.service.StoreService;

@RestController
@RequestMapping("/stores")
public class StoreController {
	@Autowired
	private StoreService userService;
	
	@GetMapping("/")
	public List<Store> getAllUsers(){
		return userService.retrieveAllStores();
	}
	
	@GetMapping("/{id}")
	public Optional<Store> getStore(@PathVariable int id) {
		return userService.getStoreById(id);
	}
	
	@PostMapping("/add-store")
	public void addUser(@RequestBody Store store){
		 userService.addStore(store);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteMed(@PathVariable Store id) {
		userService.deleteStoreById(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateMed_member(@RequestBody Store store) {
		userService.updateStoreById(store);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAllMed() {
		userService.deleteAllStores();
	}
}
