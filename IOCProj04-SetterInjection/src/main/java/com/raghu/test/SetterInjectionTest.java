package com.raghu.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.beans.Employee;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// Hold the name and location of spring bean cfg file in ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/raghu/spcfg/applicationContext.xml");
		// get target spring bean class obj 
	   Object obj=ctx.getBean("emp");
		// type casting
		Employee employee=(Employee)obj;
		// invoke the b.method
		employee.printEmpDetails();
	}

}
