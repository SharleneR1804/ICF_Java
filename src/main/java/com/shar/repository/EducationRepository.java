package com.shar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shar.model.Education;

@Repository
public interface EducationRepository extends CrudRepository<Education, Long> {

}