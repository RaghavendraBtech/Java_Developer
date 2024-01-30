package com.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReqParamsController {
	
	@GetMapping("/data")
	public String processData(@RequestParam("sno") int no,@RequestParam("sname") String name) {
		System.out.println(no+" "+name);
		return "show_result";
	}
	
	
	/* if requestParam names are matching with handler methodParam name then there no need of giving
	requestParam names in @RequestParam Annotation */
	
	@GetMapping("/view")
	public String processMatching(@RequestParam int sno,@RequestParam String sname) {
		System.out.println(sno+" "+sname);
		return"show_result";
	}
	
	/*To avoid the exception through request param name is not matching with method param name
	 take(request=false) in @RequestParam Annonation  */
	@GetMapping("/report")
	public String processNotMatching(@RequestParam int sno,@RequestParam(required=false) String sname) {
		System.out.println(sno+" "+sname);
		return"show_result";
	}
	
	// taking default value for the request param in @RequestParam
	@GetMapping("/default")
	public String processDefault(@RequestParam int sno,@RequestParam(defaultValue="Raghavendra") String sname) {
		System.out.println(sno+" "+sname);
		return"show_result";
		// http://localhost:4041/default?sno=101 - 101 Raghavendra
		// http://localhost:4041/default?sno=111&name=Raghu - 111 Raghavendra
		// http://localhost:4041/default?sno=121&sname=Raghu - 121 Raghu
	}
}
