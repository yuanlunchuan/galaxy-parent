package com.galaxy.provider.user.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.galaxy.provider.user.entity.ShopKepper;
import com.galaxy.provider.user.repository.ShopKepperRepository;
import com.galaxy.provider.user.service.IShopKepperService;
import com.galaxy.provider.user.tool.PageHelper;

@Service
public class ShopKepperServiceImpl implements IShopKepperService {
	@Autowired
	private ShopKepperRepository shopKepperRepository;

	@Override
	public ShopKepper findById(Long shopKepperId) {
		return shopKepperRepository.findOne(shopKepperId);
	}

	@Override
	public void deleteById(Long shopKepperId) {
		shopKepperRepository.delete(shopKepperId);
	}

	@Override
	public ShopKepper save(ShopKepper shopKepper) {
		return shopKepperRepository.save(shopKepper);
	}

	@Override
	public ShopKepper update(ShopKepper shopKepper) {
		return shopKepperRepository.save(shopKepper);
	}

	@Override
	public Page<ShopKepper> findByShopKepperPage(PageHelper<ShopKepper> shopKepperPage) {
		PageRequest pageable = new PageRequest(shopKepperPage.getPageNumber(), shopKepperPage.getPageSize());

		Specification<ShopKepper> specification = new Specification<ShopKepper>() {
			@Override
			public Predicate toPredicate(Root<ShopKepper> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicate = new ArrayList<>();
				ShopKepper shopKepper = shopKepperPage.getObject();
				if (StringUtils.isNotBlank(shopKepper.getPhoneNumber())) {
					predicate.add(cb.equal(root.get("phoneNumber").as(String.class), shopKepper.getPhoneNumber()));
				}

				Predicate[] pre = new Predicate[predicate.size()];
				return query.where(predicate.toArray(pre)).getRestriction();
			}
		};

		Page<ShopKepper> page = shopKepperRepository.findAll(specification, pageable);
		return page;
	}

	@Override
	public List<ShopKepper> findByShopKepper(ShopKepper shopKepper) {
		PageHelper<ShopKepper> pageHelper = new PageHelper<>();
		pageHelper.setPageNumber(0);
		pageHelper.setPageSize(Integer.MAX_VALUE);
		pageHelper.setObject(shopKepper);
		return findByShopKepperPage(pageHelper).getContent();
	}

}
