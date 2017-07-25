package com.yuan.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.galaxy.provider.user.entity.DemoEntity;

@FeignClient("microservice-provider-user")
public interface DemoFeignClient {
	@RequestMapping(value = "/demos/{id}", method = RequestMethod.GET)
	public DemoEntity show(@PathVariable("id") Long id);

	@RequestMapping(value = "/demos", method = RequestMethod.POST)
	public DemoEntity create(@RequestBody DemoEntity user);
}
