package com.caio.myapi.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.caio.myapi.entity.User;
import com.caio.myapi.service.UserService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

	private final UserService userService;

	public UserResource(UserService userService) {
		this.userService = userService;
	}

	// Read
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {

		User user = this.userService.findById(id);
		return ResponseEntity.ok().body(user);
	}

	// Read
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}


	// Update
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User user) {
		User newUser = userService.update(id, user);
		return ResponseEntity.ok().body(newUser);
	}

	// Create
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user) {
		User newUser = userService.create(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		userService.delete(id);
		return ResponseEntity.noContent().build();
	}
}