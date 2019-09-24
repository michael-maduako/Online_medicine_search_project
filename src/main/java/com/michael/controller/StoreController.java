package com.michael.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Store;
import com.michael.service.StoreService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class StoreController {
	@Autowired
	private StoreService userService;
	
	
	@GetMapping("/stores/all")
	@PreAuthorize("permitAll()")

	public List<Store> getAllMedicines(){
		return userService.getAllStores();
	}
	
	@GetMapping("/stores/{id}")
	public Optional<Store> getStore(@PathVariable long id) {
		return userService.getStoreById(id);
	}
	
	@PutMapping("stores/update/{id}")
	public void updateStore(@RequestBody Store store, @PathVariable long id) {
		userService.updateById(store, id);
	}
	
	@PostMapping("/stores/add-store")
	@PreAuthorize("hasRole('MEDUSER') or hasRole('ADMIN')")
	public void addStore(@RequestBody Store user){
		 userService.addStore(user);
	}

	@DeleteMapping("/stores/delete/{id}")
	public void deleteStoreById(@PathVariable long id) {
		userService.deleteStoreById(id);
	}
}
