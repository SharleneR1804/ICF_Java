 package com.shar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shar.model.Education;
import com.shar.service.EmployeeService;

@Controller
@RequestMapping(value="/education")
public class EducationController {
	@Autowired
	 EmployeeService educationService;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("education_list");
	  List<Education> educationList = educationService.getAllEducation();
	  model.addObject("educationList", educationList);
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/addEducation/", method=RequestMethod.GET)
	 public ModelAndView addEducation() {
	  ModelAndView model = new ModelAndView();
	  
	  Education education = new Education();
	  model.addObject("educationForm", education);
	  model.setViewName("education_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/updateEducation/{id}", method=RequestMethod.GET)
	 public ModelAndView editEducation(@PathVariable("id") long id) {
	  ModelAndView model = new ModelAndView();
	  
	  Education education = educationService.getEducationById(id);
	  model.addObject("educationForm", education);
	  model.setViewName("education_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/saveEducation", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("educationForm") Education education) {
	 educationService.saveOrUpdateEdu(education);
	  
	  return new ModelAndView("redirect:/education/list");
	 }
	 
	 @RequestMapping(value="/deleteEducation/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") long id) {
	 educationService.deleteEducation(id);
	  
	  return new ModelAndView("redirect:/education/list");
	 }
}
