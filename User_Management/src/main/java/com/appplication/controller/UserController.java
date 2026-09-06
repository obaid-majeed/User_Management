package com.appplication.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appplication.dto.UserDTO;
import com.appplication.entity.User;
import com.appplication.service.UserServiceImplementation;

@RestController
public class UserController {
      
	UserServiceImplementation userService;

	public UserController(UserServiceImplementation userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/addUsers")
	public String addUsers(@RequestBody() UserDTO user) {
		   userService.addUser(user);
		   return "user added successfully";
	}
	
	@GetMapping("/viewUsers/{id}")
	public User viewUsers(@PathVariable Long id, UserDTO retrieve) {
		 return  userService.viewUser(id,retrieve);
		   
	}
	
	@PostMapping("/updateUsers/{id}")
	public User updateUsers(@PathVariable Long id) {
		return userService.updateUser(id);
	}
	
	@DeleteMapping("/deleteUsers/{id}")
	public String deleteUsers(@PathVariable Long id) {
		userService.deleteUser(id);
		return "user deleted";
	}
}
