package com.raghu.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping")
public class ShoppingServiceOperationsController {
	
	@Autowired
	private BillingServiceConsumerClient client;
	
	@GetMapping("/details")
	public ResponseEntity<String> showBillingDetails(){
		// use client comp support to invoke Provider MS service
		ResponseEntity<String> entity=client.getBillingDetails();
		String resultBody=entity.getBody(); // Provider MS results
		// return ResponseEntity<String> object from Consumer MS
		String billInfo="Bill amount::"+new Random().nextInt(100000);// consumer MS results
		return new ResponseEntity<String>(billInfo+"......"+resultBody,HttpStatus.OK);// contains provider MS+consumer mS
		
	}

}
