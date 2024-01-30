package com.raghu.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.raghu.model.Student;



@Controller
public class DataRenderingTechniques {
	// Passing simple values
	@GetMapping("/show")
	public String sendData(Map<String,Object> map) {
		// put simple values to model attributes
		map.put("name", "Ujwala");
		map.put("address", "Hyd");
		return "simple_data";
	}
	
	
	// passing collections and arrays
	@GetMapping("/view")
	public String collectionArrayData(Map<String,Object> map) {
		// put arrays, collections as the model attribute values
		map.put("favColors", new String[] {"yellow", "green","biue"});
		map.put("nickNames",List.of("chinni","potti","sweety"));
		map.put("phoneNumbers",Set.of(8186060687L,9010441815L,7288097474L));
		map.put("idDetails",Map.of("idDetails",224,"name","Raghu","course","Java"));
		//return LVN
		return "collection_array";
	}
	// passing model class object
	@GetMapping("/report")
	public String modelData(Map<String,Object> map) {
		// create model class object with data
		Student std=new Student();
		std.setStdId(101);
		std.setStdName("Raghu");
		std.setCourse("Java");
		std.setFee(25000.00);
		// put model class object to model arrtibute
		map.put("studentInfo", std);
		// return LVN
		return"model_data";
	}
	// passing collection of model class object
	@GetMapping("/data")
	public String collectionModelData(Map<String,Object> map) {
		// create collection of model class objects
		List<Student> stdList=List.of(new Student(111,"Ujwala","Dot net",12000.00),
				new Student(222,"Chinni","java",24000.00),
				new Student(333,"Prathyusha","AWS",5000.00));
		// put collection of model class object to model attribute
		map.put("stdListInfo", stdList);
		return "collection_model";
		
	}

}
