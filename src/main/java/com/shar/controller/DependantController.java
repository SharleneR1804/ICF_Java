 package com.shar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shar.model.Dependant;
import com.shar.service.EmployeeService;

@Controller
@RequestMapping(value="/dependants")
public class DependantController {
	@Autowired
	 EmployeeService dependantService;
	 
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("dependant_list");
	  List<Dependant> dependantList = dependantService.getAllDependants();
	  model.addObject("dependantList", dependantList);
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/addDependant/", method=RequestMethod.GET)
	 public ModelAndView addDependant() {
	  ModelAndView model = new ModelAndView();
	  
	  Dependant dependant = new Dependant();
	  model.addObject("dependantForm", dependant);
	  model.setViewName("dependant_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/updateDependant/{id}", method=RequestMethod.GET)
	 public ModelAndView editDependant(@PathVariable("id") long id) {
	  ModelAndView model = new ModelAndView();
	  
	  Dependant dependant = dependantService.getDependantById(id);
	  model.addObject("dependantForm", dependant);
	  model.setViewName("dependant_form");
	  
	  return model;
	 }
	 
	 @RequestMapping(value="/saveDependant", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("dependantForm") Dependant dependant) {
	 dependantService.saveOrUpdateDep(dependant);
	  
	  return new ModelAndView("redirect:/dependants/list");
	 }
	 
	 @RequestMapping(value="/deleteDependant/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") long id) {
	 dependantService.deleteDependant(id);
	  
	  return new ModelAndView("redirect:/dependants/list");
	 }
}
