package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.dao.MedUserRepo;
import com.michael.model.MedUser;

@Service // (( Holds the business logic and users))
public class MedUserService {
	@Autowired
	private MedUserRepo userRepo;

	public List<MedUser> retrieveAllMedUserInfo() {
		userRepo.findAll().forEach(System.out::println);
		return (List<MedUser>)userRepo.findAll();
	}

	public Optional<MedUser> getMedUserById(int id) {
		// optional handles nullpointerexceptions
		return userRepo.findById(id);
	}

	public void addMedUserInfo(MedUser user) {
		userRepo.save(user);
	}
	
	public void deleteMedUserById(MedUser user) {
		userRepo.deleteById(user.getStoreid());
	}
	
	public void deleteAllMedUsers() {
		userRepo.deleteAll();
	}
	

	
}
