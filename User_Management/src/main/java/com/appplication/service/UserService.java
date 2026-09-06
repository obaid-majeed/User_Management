package com.appplication.service;

import java.util.List;

 
import com.appplication.dto.UserDTO;
import com.appplication.entity.User;

public interface UserService {
            
	public String addUser(UserDTO user);
	public User viewUser(Long id);
	public String updateUser(Long id, UserDTO retrieve);
	public boolean deleteUser(Long id);
	public List<User> viewAll();
	
}
