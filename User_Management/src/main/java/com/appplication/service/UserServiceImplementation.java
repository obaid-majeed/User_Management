package com.appplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

  import com.appplication.dto.UserDTO;
import com.appplication.dto.UserResponseDto;
import com.appplication.entity.User;
import com.appplication.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public UserServiceImplementation(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public String addUser(UserDTO user) {
		
		if (userRepository.existsByUsername(user.getUsername())) {
			return "Username already exists";
		}
		if (userRepository.existsByEmail(user.getEmail())) {
			return "Email already exists";
		}
		if (userRepository.existsByMobile(user.getMobile())) {
			return "Mobile already exists";
		}
		
		User use = new User();
		use.setUsername(user.getUsername());
		use.setEmail(user.getEmail());
		use.setPassword(passwordEncoder.encode(user.getPassword()));
   		
 		use.setDpUr(user.getDpUr());
 	    use.setAddress(user.getAddress());
 	    use.setMobile(user.getMobile());
 	    use.setDob(user.getDob());
 	    use.setGender(user.getGender());
 		
   		userRepository.save(use); // Fixed: save entity, not DTO
		return "User added";
	}

	@Override
	public UserResponseDto viewUser(Long id) {
		User user = userRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
	    return mapToResponseDto(user);
 			}
	
	private UserResponseDto mapToResponseDto(User user) {
	    UserResponseDto dto = new UserResponseDto();
	    dto.setUsername(user.getUsername());
	    dto.setEmail(user.getEmail());
	    dto.setMobile(user.getMobile());
	    dto.setDob(user.getDob());
	    dto.setGender(user.getGender());
	    dto.setAddress(user.getAddress());
	    dto.setDpUr(user.getDpUr());
	    return dto;
	}
	
	@Override
	public String updateUser(Long id, UserDTO retrieve) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {
			User existUser = optionalUser.get();
			existUser.setUsername(retrieve.getUsername());
			existUser.setEmail(retrieve.getEmail());
			existUser.setPassword(passwordEncoder.encode(retrieve.getPassword()));
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
