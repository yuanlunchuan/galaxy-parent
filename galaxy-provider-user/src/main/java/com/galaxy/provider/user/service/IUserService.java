package com.galaxy.provider.user.service;

import com.galaxy.provider.user.entity.User;

public interface IUserService {
	User save(User user);
	void delete(User user);
	User findById(Long id);
}
