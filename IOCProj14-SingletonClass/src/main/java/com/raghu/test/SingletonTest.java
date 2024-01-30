package com.raghu.test;

import com.raghu.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		p1.print("Hello");
		p2.print("Hii");
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));
	}

}
