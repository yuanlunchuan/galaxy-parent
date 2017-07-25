package com.galaxy.provider.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.provider.user.entity.DemoEntity;
import com.galaxy.provider.user.service.IDemoService;

@RestController
public class DemosController {
	@Autowired
	private IDemoService demoService;

	@GetMapping("/demos/{id}")
	public DemoEntity index(@PathVariable Long id){
		return demoService.findById(id);
	}

	@PostMapping("/demos")
	public DemoEntity create(@RequestBody DemoEntity demo){
		return demoService.save(demo);
	}
}
