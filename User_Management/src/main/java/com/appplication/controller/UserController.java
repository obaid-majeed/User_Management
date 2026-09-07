package com.appplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appplication.dto.UserDTO;
import com.appplication.dto.UserResponseDto;
import com.appplication.entity.User;
import com.appplication.service.UserServiceImplementation;

@RestController
public class UserController {
      
	private final UserServiceImplementation userService;

	public UserController(UserServiceImplementation userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/addUsers")
	public String addUser(@RequestBody() UserDTO user) {
		   userService.addUser(user);
		   return "user added successfully";
	}
	
	@GetMapping("/viewUsers/{id}")
	public UserResponseDto viewUser(@PathVariable Long id) {
		 return  userService.viewUser(id);
		   
	}
	
	@PutMapping("/updateUsers/{id}")
	public String updateUser(@PathVariable Long id, @RequestBody UserDTO retrieve) {
		 userService.updateUser(id, retrieve);
	   return "updated";         
	}
	
	@DeleteMapping("/deleteUsers/{id}")
	public String deleteUsers(@PathVariable Long id) {
		userService.deleteUser(id);
		return "user deleted";
	}
	
	@GetMapping("/viewAll")
	public List<User> viewAll() {
		return userService.viewAll();
		 
	}
}
