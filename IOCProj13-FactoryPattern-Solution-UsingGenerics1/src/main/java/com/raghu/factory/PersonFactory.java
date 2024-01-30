package com.raghu.factory;

import java.lang.reflect.Constructor;
import com.raghu.comp.AadharDetails;
import com.raghu.comp.Customer;
import com.raghu.comp.Employee;
import com.raghu.comp.Person;
import com.raghu.comp.Student;

public class PersonFactory {
	
	// static factory method(having geniric/commom return type)
	public static <T extends Person> T  getPerson(Class<T> clazz) throws Exception  {
		
	
			Constructor cons[]=clazz.getDeclaredConstructors();
			Object obj=null;
			if(clazz==Employee.class) {
				AadharDetails details=new AadharDetails(353726L, 24, 8186060687L);
				obj=cons[0].newInstance("Raghu","Chennai",details,"Tcs",56734.0);
			}
			else if(clazz==Student.class) {
				AadharDetails details=new AadharDetails(3628327672L, 20, 1234567890L);
				obj=cons[0].newInstance("Ujwala","hyd",details,"java",123);
			}
			else if(clazz==Customer.class) {
				AadharDetails details=new AadharDetails(98765432L, 28, 9876543218L);
				obj=cons[0].newInstance("silpa","kurnool",details,1234,63467.0);
			}
			else {
				throw new IllegalArgumentException("Invalid person type");
			}
			return (T) obj;
	}
}
