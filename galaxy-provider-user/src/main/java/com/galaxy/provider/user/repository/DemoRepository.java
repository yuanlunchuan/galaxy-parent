package com.galaxy.provider.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galaxy.provider.user.entity.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Long>  {

}
