package com.si.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
