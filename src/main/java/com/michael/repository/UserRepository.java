package com.michael.repository;

import java.util.Optional;
//import java.util.Set;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.michael.model.Role;
import com.michael.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> getUserById(long id);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Optional<User> findByRoles(String roles);

}