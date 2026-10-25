package com.caio.myapi.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.caio.myapi.entity.User;
import com.caio.myapi.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;

	UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}
