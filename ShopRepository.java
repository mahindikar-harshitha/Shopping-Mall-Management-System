package com.si.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.Shop;

@Repository

public interface ShopRepository extends JpaRepository<Shop, Long > {

}
