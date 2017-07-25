package com.yuan.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yuan.cloud.entity.User;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {
  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
  public User findById(@PathVariable("id") Long id);

  @RequestMapping(value = "/users", method = RequestMethod.POST)
  public User postUser(@RequestBody User user);
}
