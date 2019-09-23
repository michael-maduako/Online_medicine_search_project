package com.michael.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.User;
import com.michael.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TestRestAPIs {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/api/test/allUsers")
	public List<User> getAllUsers(){
		System.out.println(userService);
		return userService.findAll();
	}
	
	
	
//	@DeleteMapping("/api/test/{name}")
//	@PreAuthorize("hasRole('ADMIN')")
//	public void deleteUser(@PathVariable String name) {
//		userService.deleteUser(name);
//	}
	
	@DeleteMapping("/api/test/{id}")
	//@PreAuthorize("hasRole('ADMIN')")
	public void deleteUserById(@PathVariable long id) {
		userService.deleteById(id);
	}
	
	
	@GetMapping("/api/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {
		return ">>> User Contents!";
	}

	@GetMapping("/api/test/pm")
	@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return ">>> Project Management Board";
	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}