package com.raghu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.beans.EmployeeBean;

public class SertterInjectionTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/raghu/cfgs/applicationContext.xml");
		EmployeeBean eb=context.getBean(EmployeeBean.class,"id2");
		eb.printEmpDetails();
				
}

}
