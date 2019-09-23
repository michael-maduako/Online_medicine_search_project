package com.michael.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.michael.model.Med;
import com.michael.service.MedService;

@CrossOrigin()
@RestController
public class MedController {
	@Autowired
	private MedService medService;
	

	@GetMapping("/med/all")
	public List<Med> getAllMedicines(){
		return medService.getAllMedicines();
	}
	
	@GetMapping("/med/{id}")
	public Optional<Med> getMedicine(@PathVariable long id) {
		return medService.getMedById(id);
	}
	
	@PostMapping("/med/add")
	//@PreAuthorize("hasRole('MEDUSER') or hasRole('ADMIN')")
	public void addUser(@RequestBody Med user){
		 medService.addMedicine(user);
	}

	@DeleteMapping("/med/delete/{id}")
	//@PreAuthorize("hasRole('MEDUSER') or hasRole('ADMIN')")
	public void deleteMed(@PathVariable long id) {
		medService.deleteById(id);
	}
	
	@PutMapping("/med/update/{id}")
	public void updateMed(@RequestBody Med med, @PathVariable long id) {
		medService.updateMedicineById(med,id);
	}
}
