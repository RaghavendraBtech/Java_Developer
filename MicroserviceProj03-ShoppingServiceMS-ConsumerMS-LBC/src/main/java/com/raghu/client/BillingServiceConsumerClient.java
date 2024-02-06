package com.raghu.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {
	
	@Autowired
	private LoadBalancerClient client;
	
	// get Provider MS less Load Factor Service Instance
	public ResponseEntity<String> getBillingDetails(){
		ServiceInstance SI=client.choose("Billing-service");
		// gather details from service Instance(producer MS)
		URI uri=SI.getUri();
		// prepare complete URL (URI+path)
		String url=uri+"/billing/api/info";
		// create RestTemplate class object
		RestTemplate template=new RestTemplate();
		// consume the Provider MS service
		ResponseEntity<String> entity=template.getForEntity(url, String.class);
		return entity;
		
	}

}
