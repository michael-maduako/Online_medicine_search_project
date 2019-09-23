package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.michael.repository.BloodRepo;
import com.michael.model.Blood;

@Service // (( Holds the business logic and users))
public class BloodService {
	@Autowired
	private BloodRepo userRepo;

	public List<Blood> retrieveAllBloodInfo() {
		userRepo.findAll().forEach(System.out::println);
		return (List<Blood>)userRepo.findAll();
	}

	public Optional<Blood> getBloodById(long id) {
		// optional handles nullpointerexceptions
		return userRepo.findById(id);
	}

	public void addBloodInfo(Blood user) {
		userRepo.save(user);
	}
	
	public void deleteBloodById(long id) {
		userRepo.deleteById(id);
	}
	
	public void updateBloodById(Blood user,long id) {
		user.setId(id);
		userRepo.save(user);
			
	}
	
}
