package com.appplication.service;

import java.util.List;

import org.springframework.security.core.userdetails.User;

import com.appplication.dto.UserDTO;

public interface UserService {
            
	
	public String addUser(UserDTO user);
	public User viewUser(Long id);
	public String updateUser(Long id, UserDTO retrieve);
	public boolean deleteUser(Long id);
	public List<User> viewAll();
	
}
