package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.dao.MedicineRepo;
import com.michael.model.Medicine;

@Service // (( Holds the business logic and users))
public class MedicineService {
	@Autowired
	private MedicineRepo userRepo;

	public List<Medicine> retrieveAllMedicines() {
		userRepo.findAll().forEach(System.out::println);
		return (List<Medicine>)userRepo.findAll();
	}

	public Optional<Medicine> getMedicineById(int id) {
		// optional handles nullpointerexceptions
		return userRepo.findById(id);
	}

	public void addMedicine(Medicine user) {
		userRepo.save(user);
	}
	
	public void deleteMedicineById(Medicine user) {
		userRepo.deleteById(user.getMedStoreid());
	}
	
	public void deleteAllMedicines() {
		userRepo.deleteAll();
	}
	

	public void updateMedicineById(Medicine ad) {
		userRepo.save(ad);
		
	}
	
}
