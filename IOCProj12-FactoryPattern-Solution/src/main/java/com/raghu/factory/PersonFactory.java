package com.raghu.factory;

import com.raghu.comp.AadharDetails;
import com.raghu.comp.Customer;
import com.raghu.comp.Employee;
import com.raghu.comp.Person;
import com.raghu.comp.Student;

public class PersonFactory {
	
	// static factory method(having geniric/commom return type)
	public static Person getPerson(String type) {
		Person per=null;
		AadharDetails details=null;
		if(type.equalsIgnoreCase("emp")) {
			details=new AadharDetails(98765432L, 20, 8186060687L);
			per=new Employee("Raghu", "Hyd", details, "HCL", 15000.0);
		}
		else if(type.equalsIgnoreCase("stud")) {
			details=new AadharDetails(564834732L, 23, 867467374893L);
			per=new Student("Ravali", "Bang", details, "Java", 123);
		}
		else if(type.equalsIgnoreCase("cust")) {
			details=new AadharDetails(547387628L, 25, 74658837389L);
			per=new Customer("Lakshmi", "Delhi", details, 56878, 5683.0);
		}
		else {
			throw new IllegalArgumentException("Invalid person type");
		}
		return per;
	}
}
