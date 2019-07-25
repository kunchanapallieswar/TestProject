package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/student")
public class StudentController {
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student thestudent=new Student();
		model.addAttribute("student",thestudent);
		 return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String showForm(@ModelAttribute("student") Student thestudent) {
		System.out.println("the studemt"+thestudent.getFirstName()+" "+thestudent.getLastName());
	
		return "student-confirmation";
	}
	
	
	
}
