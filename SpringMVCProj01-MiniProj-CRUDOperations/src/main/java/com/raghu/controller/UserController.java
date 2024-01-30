package com.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.raghu.model.User;
import com.raghu.repo.UserRepo;
@Controller
public class UserController {
	@Autowired
	private UserRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return"home";
	}
	
	
	@RequestMapping("/reg")
	public String userRegister() {
		return"userreg";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String saveUser(@RequestParam int id,@RequestParam String name,@RequestParam String password,@RequestParam String email,@RequestParam String gender,@RequestParam String country,User user,ModelMap m) {
		repo.save(user);
		return"sucess";
	}
	
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewAllUser(ModelMap m) {
		m.put("users", repo.findAll());
		return"viewUser";
	}
	
	
	 @RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	    public String deleteUser(@PathVariable int id)
	    {
	    	repo.deleteById(id);
	    	 return "viewUser"; 
	    }
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	public String editUser(@PathVariable int id,ModelMap m) {
		User user=repo.findById(id).get();
		m.put("command", user);
		return"editUser";
	}
	@RequestMapping(value="/edituser",method=RequestMethod.GET)
	public String allUser(@RequestParam String name,
			@RequestParam String password,
			@RequestParam String email,
			@RequestParam String gender,@RequestParam String country,
			User user,ModelMap m) {
			repo.save(user);
			return"viewUser";
	}
}
