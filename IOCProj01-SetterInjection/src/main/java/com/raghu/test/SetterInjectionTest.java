package com.raghu.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.raghu.beans.WishMessageGenerator;

public class SetterInjectionTest{
	public static void main(String[]args) {
	// Hold the name and location of spring bean cfg file in Resource object
	FileSystemResource res=new FileSystemResource("src/main/java/com/raghu/cfgs/applicationContext.xml");
	// create BeanFactory spring container (IOC Container)
	XmlBeanFactory factory=new XmlBeanFactory(res);
	// get target spring bean class obj injected with dependent spring bean class obj
	Object object=factory.getBean("wmg");
	// type casting
	WishMessageGenerator generator=(WishMessageGenerator)object;
	// invoke the b.method
	String msg=generator.generateMessage("Raghu");
	System.out.println("wish message is ::"+ msg);
	}
}
