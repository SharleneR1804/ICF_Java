package com.shar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shar.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}