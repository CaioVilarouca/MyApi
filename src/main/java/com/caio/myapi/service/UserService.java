package com.caio.myapi.service;

import java.util.List;
import java.util.Optional;

import com.caio.myapi.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import com.caio.myapi.entity.User;
import com.caio.myapi.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;

	UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	// <Optional> Pode ou não retorna alguma coisa
	public User findById(Integer id) {
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuário não encontrado com o ID: " + id));
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
}
