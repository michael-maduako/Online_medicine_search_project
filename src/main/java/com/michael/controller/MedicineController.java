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

import com.michael.model.Medicine;
import com.michael.service.MedicineService;

@RestController
public class MedicineController {
	@Autowired
	private MedicineService userService;
	
	@GetMapping("/medicine/")
	public List<Medicine> getAllMedicines(){
		return userService.retrieveAllMedicines();
	}
	
	@GetMapping("/medicine/{id}")
	public Optional<Medicine> getMedicine(@PathVariable int id) {
		return userService.getMedicineById(id);
	}
	
	@PostMapping("/medicine/add-medicine")
	public void addUser(@RequestBody Medicine user){
		 userService.addMedicine(user);
	}

	@DeleteMapping("/medicine/{id}")
	public void deleteMed(@PathVariable Medicine id) {
		userService.deleteMedicineById(id);
	}
	
	@PutMapping("/medicine/update/{id}")
	public void updateMed(@RequestBody Medicine ad) {
		userService.updateMedicineById(ad);
	}

	@DeleteMapping("/medicine/deleteAll")
	public void deleteAllMed() {
		userService.deleteAllMedicines();
	}
}
