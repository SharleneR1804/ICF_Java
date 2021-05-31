 package com.shar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shar.model.Employee;
import com.shar.service.EmployeeService;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	 EmployeeService employeeService;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("employee_list");
	  List<Employee> employeeList = employeeService.getAllEmployees();
	  model.addObject("employeeList", employeeList);
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/addEmployee/", method=RequestMethod.GET)
	 public ModelAndView addEmployee() {
	  ModelAndView model = new ModelAndView();
	  
	  Employee employee = new Employee();
	  model.addObject("employeeForm", employee);
	  model.setViewName("employee_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/updateEmployee/{id}", method=RequestMethod.GET)
	 public ModelAndView editEmployee(@PathVariable("id") long id) {
	  ModelAndView model = new ModelAndView();
	  
	  Employee employee = employeeService.getEmployeeById(id);
	  model.addObject("employeeForm", employee);
	  model.setViewName("employee_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/saveEmployee", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("employeeForm") Employee employee) {
	 employeeService.saveOrUpdateEmp(employee);
	  
	  return new ModelAndView("redirect:/employee/list");
	 }
	 
	 @RequestMapping(value="/deleteEmployee/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") long id) {
	 employeeService.deleteEmployee(id);
	  
	  return new ModelAndView("redirect:/employee/list");
	 }
}
