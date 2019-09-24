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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Blood;
import com.michael.service.BloodService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/blood")
public class BloodController {
	@Autowired
	private BloodService userService;
	
	@GetMapping("/")
	@PreAuthorize("permitAll()")
	public List<Blood> getAllUsers(){
		return userService.retrieveAllBloodInfo();
	}
	
	@GetMapping("/{id}")
	public Optional<Blood> getBloodById(@PathVariable long id) {
		return userService.getBloodById(id);
	}
	
	
	@PostMapping("/add-blood")
	@PreAuthorize("permitAll()")
	public void addBloodInfo(@RequestBody Blood user){
		 userService.addBloodInfo(user);
	}

	@DeleteMapping("/user/{id}")
	//@PreAuthorize("hasRole('BLOOD') or hasRole('ADMIN')")
	public void deleteBloodById(@PathVariable long id) {
		userService.deleteBloodById(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateBloodInfo(@RequestBody Blood ad, @PathVariable long id) {
		userService.updateBloodById(ad,id);
	}

	
}
