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
		use.setRole(user.getRole());
		userRepository.save(use); // Fixed: save entity, not DTO
		return "User added";
	}

	@Override
	public User viewUser(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public String updateUser(Long id, UserDTO retrieve) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {
			User existUser = optionalUser.get();
			existUser.setUsername(retrieve.getUsername());
			existUser.setEmail(retrieve.getEmail());
			existUser.setPassword(retrieve.getPassword());
			existUser.setRole(retrieve.getRole());
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

	@Override
	public List<User> viewAll() {
		return userRepository.findAll();
	}
}
