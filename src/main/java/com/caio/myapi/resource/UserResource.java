package com.caio.myapi.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.caio.myapi.entity.User;
import com.caio.myapi.service.UserService;

import java.util.List;

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

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User user) {
		User newUser = userService.update(id,user);
		return ResponseEntity.ok().body(newUser);
	}
}
