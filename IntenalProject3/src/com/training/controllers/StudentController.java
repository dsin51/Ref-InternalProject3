package com.training.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.*;

import com.training.impl.DAOImpl;

@Controller
public class StudentController  {
	@Autowired
	DAOImpl imp;
	
	@Autowired
	PersonalInfo perInfo;

	@RequestMapping("/")
	public String init(){
		return "index";
	}
	
	
	@Autowired
	private ModelAndView mdl;
	
	@RequestMapping(name="/first",method=RequestMethod.GET)
	private ModelAndView initForm(){
		
		//mdl.setViewName("first");
		mdl.addObject("command",perInfo);
		return mdl;
		
	} 
	@RequestMapping(value="/addDetails" , method=RequestMethod.POST)
	public ModelAndView initForm(@ModelAttribute("data") PersonalInfo perobj){
		System.out.println(perobj);
		
		imp.add(perobj);
		
		return mdl;
		
	}
	
	@RequestMapping(value="/Show")
	public String deptList(Model model){ 	
	List<String> department = new ArrayList<String>();
		department.add("ECE");
		department.add("CSE");
		department.add("EEE");
		department.add("MECH");
		department.add("CIVIL");
		model.addAttribute("deptlist",department);
		return "display"; 
}
	
	
	

}