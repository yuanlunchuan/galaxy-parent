package com.yuan.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuan.cloud.entity.User;
import com.yuan.cloud.feign.UserFeignClient;
@RestController
public class UsersController {

	@Autowired
	private UserFeignClient userFeignClient;

	@GetMapping("/users/{id}")
	public User findById(@PathVariable Long id) {
		User user = this.userFeignClient.findById(id);
		return user;
	}

    @PostMapping("/users")
    public User getUser(User user) {
        return userFeignClient.postUser(user);
    }

}
