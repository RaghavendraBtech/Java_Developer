package com.raghu.factory;

import com.raghu.comps.BlueDart;
import com.raghu.comps.Courier;
import com.raghu.comps.DTDC;
import com.raghu.comps.Flipkart;

//factory pattern
public class FlipkartFactory {
	
	// static factory method
	public static Flipkart getInstance(String courierType) {
		// create dependency class obj
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("invalid courier type");
		// create target class obj
		Flipkart fkrt=new Flipkart();
		fkrt.setCourier(courier);
		return fkrt;
		
	}

}
