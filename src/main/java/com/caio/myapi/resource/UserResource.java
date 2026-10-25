package com.caio.myapi.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.myapi.entity.User;
import com.caio.myapi.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	private final UserService userService;
	
	public UserResource(UserService userService) {
		this.userService = userService;
	}
 
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		
		User user = this.userService.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
