package com.raghu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raghu.service.ISeasonService;

@Controller
public class SeasonController {
	@Autowired
	private ISeasonService service;
	
	@RequestMapping("/")
	public String showHome() {
		return"welcome";
	}
	@RequestMapping("/season")
	public String showSeason(Map<String,Object>map) {
		// use service
		String msg=service.findSeason();
		// here keep results in model attribute
		map.put("resultMsg", msg);
		// return LVN or ModelAndView
		return"dispay";
	}

}
