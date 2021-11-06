package com.gspy.gspy.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gspy.gspy.models.User;
import com.gspy.gspy.repository.UserRepository;

@RestController
@RequestMapping(value = "/api")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> listUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUSer(@PathVariable(name = "id") long id) {
		return userRepository.findById(id);
	}
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}
}
