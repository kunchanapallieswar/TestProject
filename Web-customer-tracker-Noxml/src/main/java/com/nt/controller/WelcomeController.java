package com.nt.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	public WelcomeController() {
	System.out.println(" welcome controller contructor");	
	}
	
	@RequestMapping("/")
	public String showPage() {
		
	System.out.println("welcome showpage");
		return "main_page";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		
	
		return "helloworld_form";
	}
	
	@RequestMapping("/processForm22")
	public String ProcessForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion2")
		public String ModelViewData(HttpServletRequest req, Model model) {	
	// read the request parameter from the html form
		String name=req.getParameter("sname");
		
		//convert data to upper form
	name=	name.toUpperCase();
	String result="Yo"+name;
	model.addAttribute("message", result);
		return "helloworld";
		}
	


}
