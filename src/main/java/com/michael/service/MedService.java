package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.repository.MedRepo;
import com.michael.model.Med;

@Service // (( Holds the business logic and users))
public class MedService {
	
	@Autowired
	private MedRepo medRepo;
	
	

	public List<Med> getAllMedicines() {
		medRepo.findAll().forEach(System.out::println);
		return (List<Med>)medRepo.findAll();
	}

	public Optional<Med> getMedById(long id) {
		// optional handles nullpointerexceptions
		return medRepo.findById(id);
	}

	public void addMedicine(Med med) {
		medRepo.save(med);
	}
	
	public Optional<Med> getByStoreName(String name){
		return medRepo.findByStoreName(name);
	}
	
//	public void deleteMedicineById(Medicines user) {
//		userRepo.deleteById(user.getMedStoreid());
//	}
	
	public void deleteById(long id) {
		 medRepo.deleteById(id);
	}
	

	public void updateMedicineById(Med med, long id) {
		med.setId(id);
		medRepo.save(med);
		
	}
	
}
