package com.raghu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.model.Student;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class StudentDetails {
	@RequestMapping("/")
	public String studentHomePage() {
		return "home_page";
	}
	
	@GetMapping("/register")
	public String showRegisterHomePage() {
		return "student_register";
	}
	@PostMapping("/register")
	public String processStudentDetails(Map<String,Object>map, @ModelAttribute("std") Student st) {
		System.out.print("model class object data :"+ st);
		// genetare results
		String grade=null;
		if(st.getAvg()>=90)
			grade="First class with Distinction";
		else if(st.getAvg()>=70)
			grade="First class";
		else if(st.getAvg()>=50)
			grade="Second class";
		else if(st.getAvg()>=35)
			grade="Third class";
		else 
			grade="Fail";
		// keep results in model attribute
		map.put("result", grade);
		// return LVN
		return "display_results";
	}

}
