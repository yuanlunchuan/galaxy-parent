package com.galaxy.provider.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.provider.user.entity.DemoEntity;
import com.galaxy.provider.user.repository.DemoRepository;
import com.galaxy.provider.user.service.IDemoService;

@Service
public class DemoServiceImpl implements IDemoService {
	@Autowired
	private DemoRepository demoRepository;
	
	@Override
	public DemoEntity save(DemoEntity demo) {
		return demoRepository.save(demo);
	}

	@Override
	public void delete(DemoEntity demo) {
		demoRepository.delete(demo);
	}

	@Override
	public DemoEntity findById(Long id) {
		return demoRepository.findOne(id);
	}

}
