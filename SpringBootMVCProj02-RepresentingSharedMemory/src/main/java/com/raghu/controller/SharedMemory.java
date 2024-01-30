package com.raghu.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SharedMemory {
	// Best way of representing sharedMemory becoz it makes the code non-invasive
	/*@RequestMapping("/process")
	public String process(Map<String,Object> map) {
		System.out.println("SharedMemory.process()::SharedMemory Object class name::"+map.getClass());
		// add model attribute to shared memory
		map.put("name","Raghu B.Tech");
		map.put("domain","Developer");
		map.put("sysDt",LocalDateTime.now());
		return"show_data";
	}*/
	
	// This is bad practice 
	/*@RequestMapping("/process")
	public String process(Model model) {
		System.out.println("SharedMemory.process()::SharedMemory Object class name::"+model.getClass());
		// add model attribute to shared memory
		model.addAttribute("name","Raghu B.Tech");
		model.addAttribute("domain","Developer");
		model.addAttribute("sysDt",LocalDateTime.now());
		return"show_data";
	}*/
	
	
	// This is bad practice
	@RequestMapping("/process")
	public String process(ModelMap map) {
		System.out.println("SharedMemory.process()::SharedMemory Object class name::"+map.getClass());
		// add model attribute to shared memory
		map.addAttribute("name","Raghu B.Tech");
		map.addAttribute("domain","Developer");
		map.addAttribute("sysDt",LocalDateTime.now());
		return"show_data";
	}

}
