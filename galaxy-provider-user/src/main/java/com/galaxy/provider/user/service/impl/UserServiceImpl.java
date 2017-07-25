package com.galaxy.provider.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.provider.user.entity.User;
import com.galaxy.provider.user.repository.UserRepository;
import com.galaxy.provider.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(User user) {
		 userRepository.delete(user);
	}

	@Override
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

}
