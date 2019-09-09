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
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Blood;
import com.michael.service.BloodService;

@RestController
public class BloodController {
	@Autowired
	private BloodService userService;
	
	@GetMapping("/blood/")
	public List<Blood> getAllUsers(){
		return userService.retrieveAllBloodInfo();
	}
	
	@GetMapping("/blood/{id}")
	public Optional<Blood> getUser(@PathVariable String id) {
		return userService.getBloodByType(id);
	}
	
	@PostMapping("/blood/add-blood")
	public void addUser(@RequestBody Blood user){
		 userService.addBloodInfo(user);
	}

	@DeleteMapping("/blood/user/{id}")
	public void deleteMed(@PathVariable Blood id) {
		userService.deleteBloodById(id);
	}
	
	@PutMapping("/blood/update/{id}")
	public void updateMed_member(@RequestBody Blood ad) {
		userService.updateBloodById(ad);
	}

	@DeleteMapping("/blood/deleteAll")
	public void deleteAllMed() {
		userService.deleteAllBlood();
	}
}
