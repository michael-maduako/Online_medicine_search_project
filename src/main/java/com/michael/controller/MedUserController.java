package com.michael.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.MedUser;
import com.michael.service.MedUserService;

@RestController
public class MedUserController {
	@Autowired
	private MedUserService userService;
	
	@GetMapping("/meduser/")
	public List<MedUser> getAllMedicines(){
		return userService.retrieveAllMedUserInfo();
	}
	
	@GetMapping("/meduser/{id}")
	public Optional<MedUser> getMedicine(@PathVariable int id) {
		return userService.getMedUserById(id);
	}
	
	@PostMapping("/meduser/add-meduser")
	public void addUser(@RequestBody MedUser user){
		 userService.addMedUserInfo(user);
	}

	@DeleteMapping("/meduser/{id}")
	public void deleteMed(@PathVariable MedUser id) {
		userService.deleteMedUserById(id);
	}
	
//	@PutMapping("/medicine/update/{id}")
//	public void updateMed(@RequestBody MedUser ad) {
//	}

	@DeleteMapping("/meduser/deleteAll")
	public void deleteAllMed() {
		userService.deleteAllMedUsers();
	}
}
