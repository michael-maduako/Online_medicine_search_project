package com.michael.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.dao.AdminRepo;
import com.michael.model.Admin;

@Service // (( Holds the business logic and users))
public class AdminService {
	@Autowired
	private AdminRepo userRepo;

	public List<Admin> retrieveAllUsers() {
		userRepo.findAll().forEach(System.out::println);
		return (List<Admin>)userRepo.findAll();
	}

	public Optional<Admin> getUserById(int id) {
		// optional handles nullpointerexceptions
		return userRepo.findById(id);
	}

	public void addUser(Admin user) {
		userRepo.save(user);
	}
	
	public void deleteUserById(Admin user) {
		userRepo.deleteById(user.getMedStoreid());
	}
	
	public void deleteAllUsers() {
		userRepo.deleteAll();
	}
	

	public void updateCourseById(Admin ad) {
		userRepo.save(ad);
	}
	
}
