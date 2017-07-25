package com.yuan.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.provider.user.entity.DemoEntity;
import com.yuan.cloud.feign.DemoFeignClient;

@RestController
public class DemosController {
	@Autowired
	private DemoFeignClient demoFeignClient;
	
	@GetMapping("/demos/{id}")
	public DemoEntity findById(@PathVariable Long id) {
		return this.demoFeignClient.show(id);
	}

    @PostMapping("/demos")
    public DemoEntity getUser(@RequestBody DemoEntity demo) {
        return demoFeignClient.create(demo);
    }
}
