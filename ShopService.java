package com.si.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.si.demo.entity.Shop;

@Service
public interface ShopService {

	public  Shop saveShop(Shop shop);

	public List<Shop> fetchShopList();

	public Shop fetchShopById(Long shopId);

	public void deleteShopById(Long shopId);

	public Shop updateShop(Long shopId, Shop shop);

}
