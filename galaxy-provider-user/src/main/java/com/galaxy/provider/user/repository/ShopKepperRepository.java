package com.galaxy.provider.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.galaxy.provider.user.entity.ShopKepper;

@Repository
public interface ShopKepperRepository extends JpaRepository<ShopKepper, Long>, JpaSpecificationExecutor<ShopKepper> {

}
