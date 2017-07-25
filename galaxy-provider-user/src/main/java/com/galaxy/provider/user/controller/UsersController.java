package com.galaxy.provider.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.provider.user.entity.User;
import com.galaxy.provider.user.service.IUserService;

@RestController
public class UsersController {
	@Autowired
	private IUserService userService;

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable Long id){
		User user = userService.findById(id);
		return user;
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public User create(@RequestBody User user){
		return userService.save(user);
	}
}
