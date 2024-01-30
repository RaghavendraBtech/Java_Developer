package com.raghu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.model.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String homePage() {
		return"welcome";
	}
	@GetMapping("/register")
	public String studentFormPage(@ModelAttribute("std") Student st) {
		System.out.println("StudentController.studentFormPage()");
		System.out.print("model class object data :"+ st);
		return"student_register";
	}
	
	@PostMapping("/register")
	public String processStudent(Map<String,Object> map, @ModelAttribute("stud") Student st) {
		System.out.println("StudentController.processStudent()");
		System.out.print("model class object data :"+ st);
		String grade=null;
		if(st.getAvg()>=75)
			grade="First class with Dist";
		else if(st.getAvg()>=60)
			grade="First class";
		else if(st.getAvg()>=50)
			grade="second class";
		else if(st.getAvg()>=35)
			grade="Third class";
		else 
			grade="Fail";
		map.put("result", grade);
		return"display_result";
	}

}
