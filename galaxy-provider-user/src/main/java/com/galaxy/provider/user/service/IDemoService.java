package com.galaxy.provider.user.service;

import com.galaxy.provider.user.entity.DemoEntity;

public interface IDemoService {
	DemoEntity save(DemoEntity demo);
	void delete(DemoEntity demo);
	DemoEntity findById(Long id);
}
