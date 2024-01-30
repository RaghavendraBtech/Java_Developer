//CustomerOperationsController.java
package com.raghu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {
	
	@GetMapping("/show")
	public ResponseEntity<Customer> showCustomerDate(){
		Customer cust=new Customer(102,"Ravali","Hyd",9000.0);
		return new ResponseEntity<Customer>(cust,HttpStatus.OK);
	}

}
