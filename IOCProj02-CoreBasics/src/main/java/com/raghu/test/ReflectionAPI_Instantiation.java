package com.raghu.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_Instantiation {

	public static void main(String[] args) {
		try {
			// Load the class at runtime
			Class c=Class.forName(args[0]);
			// create object dynamically (option 1)
			Object obj=c.newInstance();
			System.out.println("obj::"+obj.toString());
			System.out.println("-------------------------");
			Constructor cons[]=c.getDeclaredConstructors();
			Object obj1=cons[0].newInstance();
			System.out.println("Obj1::"+ obj1.toString());
			System.out.println("-------------------------");
			Object obj2=cons[1].newInstance(10,20);
			System.out.println("obj2::"+obj2.toString());
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
