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

import com.michael.model.Admin;
import com.michael.service.AdminService;

@RestController

@RequestMapping("/admins")
public class AdminController {
	@Autowired
	private AdminService userService;
	
	@GetMapping("/")
	public List<Admin> getAllUsers(){
		return userService.retrieveAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<Admin> getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/add-user")
	public void addUser(@RequestBody Admin user){
		 userService.addUser(user);
	}

	@PutMapping("/update/")
	public void updateMed_member(@RequestBody Admin ad) {
		userService.updateCourseById(ad);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteMed(@PathVariable Admin id) {
		userService.deleteUserById(id);
	}
	

	@DeleteMapping("/deleteAll")
	public void deleteAllMed() {
		userService.deleteAllUsers();
	}
}
