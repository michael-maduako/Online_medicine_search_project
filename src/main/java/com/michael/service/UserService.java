package com.michael.service;


import java.util.List;
import java.util.Optional;
//import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.michael.model.Role;
import com.michael.model.User;
import com.michael.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	
	
	
	//Returns a list of every user
	public List<User> findAll(){
		System.out.println(userRepo);
		return (List<User>)userRepo.findAll();
	}
	
	public Optional<User> findByRoles(String role){
		return userRepo.findByRoles(role);
		
	}
	
	public void updateById(User user, long id) {
		user.setId(id);
		userRepo.save(user);
	}
	
	public void deleteById(long id) {
		 userRepo.deleteById(id);
	}
	

	
}
