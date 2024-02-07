package com.raghu.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingOperationsController {
	
	@Value("${server.port}")
	private int port;
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@GetMapping("/info")
	public ResponseEntity<String> showPaymentModes(){
		return new  ResponseEntity<String>("we accept UPI payment/CardPayment/NetBanking Payment/...from instance::"+instanceId+"@ port number"+port,HttpStatus.OK);
	}

}
