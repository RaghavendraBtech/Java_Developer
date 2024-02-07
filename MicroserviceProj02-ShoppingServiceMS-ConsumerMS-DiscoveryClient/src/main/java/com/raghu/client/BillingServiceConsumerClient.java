package com.raghu.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceConsumerClient {
	
	@Autowired
	private DiscoveryClient client;
	
	public ResponseEntity<String> getBillingDetails(){
		List<ServiceInstance> listSI=client.getInstances("Billing-Service");
		// get access to specific service instance of provider MS
				ServiceInstance SI=listSI.get(0);
				// gather details from service Instance(producer MS)
				URI uri=SI.getUri();
				// prepare complete URL (URI+path)
				String url=uri+"/billing/info";
				// create RestTemplate class object
				RestTemplate template=new RestTemplate();
				// consume the Provider MS service
				ResponseEntity<String> entity=template.getForEntity(url, String.class);
				return entity;
	}

}
