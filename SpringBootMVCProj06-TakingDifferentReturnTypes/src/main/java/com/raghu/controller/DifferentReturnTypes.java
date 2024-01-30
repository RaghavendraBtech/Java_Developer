package com.raghu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DifferentReturnTypes {
	
	
	@RequestMapping("/process") 
	public String processing(Map<String, Object> map) {
		// add model attributes to shared memory
		map.put("name", "silpa");
		map.put("age", 20);
		// return LVN
		return "process";
	}
	

	/*
	@RequestMapping("/process") // here LVN is request path 
	public Model processing() { 
		// manually creates shared memory object
		Model model=new BindingAwareModelMap();
		// add model attributes to shares memory
		model.addAttribute("name", "Raghu");
		model.addAttribute("age", "23");
		return model;
	}
	
	@RequestMapping("/process") // here LVN is request path 
	public Map<String, Object> processing() { 
		// manually creates shared memory object
		Map<String, Object> map=new BindingAwareModelMap();
		//add model attributes to shares memory
		map.put("name", "Ujwala");
		map.put("age", "05");
		return map;
	}
	
	@RequestMapping("/process") 
	public ModelAndView processing() { 
		// manually creates shared memory object
		ModelAndView mav=new ModelAndView();
		//add model attributes to shares memory
		mav.addObject("name", "Chinni");
		mav.addObject("age", "01");
		// place LVN to MAV object
		mav.setViewName("process");
		return mav;
	}
	
	// return type is void it takes request path is LVN
	@RequestMapping("/process")
	public void processing(Map<String, Object> map) {
		map.put("name", "Ravali");
		map.put("age", 25);
	}
	
	// handler method returns null
	@RequestMapping("/process") // here LVN is request path
	public String processing(Map<String, Object> map) {
		map.put("name", "Ramaleela");
		map.put("age", 26);
		return null;
	}
	*/
}
