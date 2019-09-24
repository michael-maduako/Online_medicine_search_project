package com.michael.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.model.Med;

@Repository
public interface MedRepo extends CrudRepository<Med, Long>{
	Optional<Med> findByStoreName(String name);

}
