package com.raghu.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class WishMessageController {
	
	@GetMapping("/display")
	public ResponseEntity<String> generateWishMessage(){
		// get system Date and Time
		LocalDateTime ldt=LocalDateTime.now();
		// get current hour of the day
		int hour=ldt.getHour();
		String msg=null;
		if(hour<12)
			msg="Good Morning";
		else if(hour<16)
			msg="Good afternoon";
		else if(hour<20)
			msg="Good Evening";
		else 
			msg="Good Night";
		//return ResponseEntity obj 
		//return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		//Response Status
		HttpStatus status=HttpStatus.OK;
		//ResponseEntiry Object
		ResponseEntity<String> entity=new ResponseEntity<String>(msg,status); 
		return entity;
	}

}
