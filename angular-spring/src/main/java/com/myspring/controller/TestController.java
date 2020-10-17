package com.myspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.model.Auser;
import com.myspring.model.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/Users"})
public class TestController {
	
	private List<User> Users = createList();

	//@RequestMapping(value = "/Users", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(produces = "application/json")
	public List<User> firstPage() {
		return Users;
	}
	
	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	public Auser validateLogin() {
		return new Auser("User successfully authenticated");
	}
	
	@DeleteMapping(path = { "/{id}" })
	public User delete(@PathVariable("id") int id) {
		User deletedusr = null;
		for (User usr : Users) {
			if (usr.getUsrId().equals(id)) {
				Users.remove(usr);
				deletedusr = usr;
				break;
			}
		}
		return deletedusr;
	}

	@PostMapping
	public User create(@RequestBody User user) {
		Users.add(user);
		System.out.println(Users);
		return user;
	}
	
	private static List<User> createList() {
		List<User> tempUsers = new ArrayList<>();
		
		User usr1 = new User(null);
		usr1.setName("usr1");
		usr1.setdetails("Automation-dev");
		usr1.setUsrId("1");


		User usr2 = new User(null);
		usr2.setName("usr2");
		usr2.setdetails("developer");
		usr2.setUsrId("2");
		
		tempUsers.add(usr1);
		tempUsers.add(usr2);
		return tempUsers;
	}


}
