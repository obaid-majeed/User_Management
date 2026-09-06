package com.appplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

 import com.appplication.dto.UserDTO;
import com.appplication.entity.User;
import com.appplication.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	private final UserRepository userRepository;

	public UserServiceImplementation(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public String addUser(UserDTO user) {
		User use = new User();
		use.setUsername(user.getUsername());
		use.setEmail(user.getEmail());
		use.setPassword(user.getPassword());
   		
 		use.setDpUr(user.getDpUr());
 	    use.setAddress(user.getAddress());
 	    use.setMobile(user.getMobile());
 	    use.setDob(user.getDob());
 	    use.setGender(user.getGender());
 		
   		userRepository.save(use); // Fixed: save entity, not DTO
		return "User added";
	}

	@Override
	public User viewUser(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));	     
			}
	
	
	@Override
	public String updateUser(Long id, UserDTO retrieve) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {
			User existUser = optionalUser.get();
			existUser.setUsername(retrieve.getUsername());
			existUser.setEmail(retrieve.getEmail());
			existUser.setPassword(retrieve.getPassword());
			existUser.setAddress(retrieve.getAddress());
			existUser.setMobile(retrieve.getMobile());
			existUser.setDob(retrieve.getDob());
			existUser.setGender(retrieve.getGender());
			existUser.setDpUr(retrieve.getDpUr());
			
 			userRepository.save(existUser); // Fixed: use existUser and match return type
			return "User updated";
		}
		throw new RuntimeException("User not found with id: " + id); // Fixed: handle missing user
	}

	@Override
	public boolean deleteUser(Long id) {
		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
			return true;
		}
		return false;
	}

	public List<User> viewAll() {
		
		 return userRepository.findAll();
		 
	}
	 
}
