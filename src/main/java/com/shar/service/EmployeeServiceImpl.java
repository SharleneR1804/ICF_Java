package com.shar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shar.model.Dependant;
import com.shar.model.Education;
import com.shar.model.Employee;
import com.shar.repository.DependantRepository;
import com.shar.repository.EducationRepository;
import com.shar.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	 @Autowired
	 EmployeeRepository employeeRepository;
	 
	 @Autowired
	 DependantRepository dependantRepository;
	 
	 @Autowired
	 EducationRepository educationRepository;

	 @Override
	 public List<Employee> getAllEmployees() {
	  return (List<Employee>) employeeRepository.findAll();
	 }

	 @Override
	 public Employee getEmployeeById(long id) {
	  return employeeRepository.findById(id).get();
	 }

	 @Override
	 public void saveOrUpdateEmp(Employee employee) {
	  employeeRepository.save(employee);
	 }

	 @Override
	 public void deleteEmployee(long id) {
	  employeeRepository.deleteById(id);
	 }
	 
	 @Override
	 public List<Dependant> getAllDependants() {
	  return (List<Dependant>) dependantRepository.findAll();
	 }

	 @Override
	 public Dependant getDependantById(long id) {
	  return dependantRepository.findById(id).get();
	 }

	 @Override
	 public void saveOrUpdateDep(Dependant dependant) {
	  dependantRepository.save(dependant);
	 }

	 @Override
	 public void deleteDependant(long id) {
	  dependantRepository.deleteById(id);
	 }
	 
	 @Override
	 public List<Education> getAllEducation() {
	  return (List<Education>) educationRepository.findAll();
	 }

	 @Override
	 public Education getEducationById(long id) {
	  return educationRepository.findById(id).get();
	 }

	 @Override
	 public void saveOrUpdateEdu(Education education) {
	  educationRepository.save(education);
	 }

	 @Override
	 public void deleteEducation(long id) {
	  educationRepository.deleteById(id);
	 }
}
