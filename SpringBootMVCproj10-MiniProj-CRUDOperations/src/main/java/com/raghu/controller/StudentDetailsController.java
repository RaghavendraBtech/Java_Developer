package com.raghu.controller;


import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.raghu.entity.Student;
import com.raghu.service.IStudentMgmtService;

@Controller
public class StudentDetailsController {
	
	
	@Autowired
	private IStudentMgmtService stdService;
	
	@RequestMapping("/home")
	public String studentHomePage() {
		return"homepage";
	}
	
	@GetMapping("/std_add") // for form launching
	public String showFormForSaveStudent(@ModelAttribute("std") Student std) {
		return"register_student";
	}
	
	/*@PostMapping("/std_add")
	public String saveStudent(@ModelAttribute("std") Student std,Map<String,Object> map) {
		// use service
		String msg=stdService.studentRegister(std);
		//Iterable<Student> itStd=stdService.getAllStudents();
		map.put("resultMsg", msg);
		//map.put("stdList", itStd);
		return"sucess";
		//return"show_student_register";
	}*/
	
	@PostMapping("/std_add") // form submission
	public String saveStudent(@ModelAttribute("std") Student std,RedirectAttributes attrs) {
		System.out.println("StudentDetailsController.saveStudent()");
		// use service
		String msg=stdService.studentRegister(std);
		//Iterable<Student> itStd=stdService.getAllStudents();
		attrs.addFlashAttribute("resultMsg", msg);
		//map.put("stdList", itStd);
		return"redirect:std_view";
	}
	
	@GetMapping("/std_view")
	public String showStudentReport(Map<String,Object> map) {
		// use service
		Iterable<Student> itStd=stdService.getAllStudents();
		// put result in model attributes
		map.put("stdList", itStd);
		// return LVN
		return"show_student_register";
	}
	
	@GetMapping("/std_edit")
	public String showEditStudentFormPage(@RequestParam int stdId,@ModelAttribute("std") Student std) {
		Student std1=stdService.getStudentById(stdId);
		// copy data
		BeanUtils.copyProperties(std1, std);
		return"update_student";
	}
	
	@PostMapping("/std_edit")
	public String editstudent(RedirectAttributes attrs,@ModelAttribute("std") Student std) {
		// use service
		String msg=stdService.updateStudent(std);
		attrs.addFlashAttribute("resultMsg", msg);
		return"redirect:std_view";
	}
	
	@GetMapping("/std_delete")
	public String deleteStudent(RedirectAttributes attrs,@RequestParam int stdId) {
		// use service
		String msg=stdService.deleteStudentById(stdId);
		attrs.addFlashAttribute("resultMsg",msg);
		return"redirect:std_view";
	}
	
	
	
}
