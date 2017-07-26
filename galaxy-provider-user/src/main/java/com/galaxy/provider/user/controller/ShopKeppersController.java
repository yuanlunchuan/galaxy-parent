package com.galaxy.provider.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.provider.user.entity.ShopKepper;
import com.galaxy.provider.user.service.IShopKepperService;

@RestController
@RequestMapping("/shopkeppers")
public class ShopKeppersController {
	@Autowired
	private IShopKepperService shopKepperService;

	@GetMapping("")
	public List<ShopKepper> index(String phoneNumber) {
		ShopKepper shopKepper = new ShopKepper();
		shopKepper.setPhoneNumber(phoneNumber);
		return shopKepperService.findByShopKepper(shopKepper);
	}

	@PostMapping("")
	public ShopKepper create(ShopKepper shopKepper) {
		return shopKepperService.save(shopKepper);
	}
}
