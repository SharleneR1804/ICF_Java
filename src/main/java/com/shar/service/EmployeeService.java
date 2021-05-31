package com.shar.service;

import java.util.List;

import com.shar.model.*;


public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(long id);
	 
	public void saveOrUpdateEmp(Employee employee);
	 
	public void deleteEmployee(long id);

	public List<Dependant> getAllDependants();
	
	public Dependant getDependantById(long Eid);
	 
	public void saveOrUpdateDep(Dependant dependant);
	 
	public void deleteDependant(long id);
	
	public List<Education> getAllEducation();
	
	public Education getEducationById(long id);
	 
	public void saveOrUpdateEdu(Education education);
	 
	public void deleteEducation(long id);
}
