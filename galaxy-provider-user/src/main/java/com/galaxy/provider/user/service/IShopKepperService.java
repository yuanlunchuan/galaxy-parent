package com.galaxy.provider.user.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.galaxy.provider.user.entity.ShopKepper;
import com.galaxy.provider.user.tool.PageHelper;

public interface IShopKepperService {
	ShopKepper findById(Long shopKepperId);

	void deleteById(Long shopKepperId);

	ShopKepper save(ShopKepper shopKepper);

	ShopKepper update(ShopKepper shopKepper);
	
	List<ShopKepper> findByShopKepper(ShopKepper shopKepper);
	
	Page<ShopKepper> findByShopKepperPage(PageHelper<ShopKepper> shopKepper);
}
