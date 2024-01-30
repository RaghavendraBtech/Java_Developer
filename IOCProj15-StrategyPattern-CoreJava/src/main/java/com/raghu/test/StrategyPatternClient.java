package com.raghu.test;

import com.raghu.comps.Flipkart;
import com.raghu.factory.FlipkartFactory;

public class StrategyPatternClient {

	public static void main(String[] args) {
		// get target class obj(Flipkart class obj) from factory
		Flipkart fkrt=FlipkartFactory.getInstance("blueDart");
		String resultMsg=fkrt.shopping(new String[] {"candle","flowers","cake","wine"},
																		new double[] {10000.0,20000.0,10000.0,30000.0});
		System.out.println(resultMsg);

	}

}
