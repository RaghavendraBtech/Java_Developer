package com.raghu.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	// Has-A property
	private Courier courier; // interface type reference

	public Flipkart() {
		System.out.println("flipkart:: 0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}
	
	public String shopping(String items[], double prices[]) {
		// cal bill amount
		double billAmt=0.0;
		for(double p:prices) {
			billAmt+=p;
	}
	// generate oder id
	int oid=new Random().nextInt(100000);
	// use courier 
	String msg=courier.deliver(oid);
	return Arrays.toString(items)+"are purchased having bill amt"+billAmt+"----->"+msg;
}
}
