package com.shar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shar.model.Dependant;

@Repository
public interface DependantRepository extends CrudRepository<Dependant, Long> {
	

}