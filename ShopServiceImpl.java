package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.si.demo.entity.Shop;
import com.si.demo.repository.ShopRepository;

@Service

public class ShopServiceImpl implements ShopService {
	
	@Autowired
	private ShopRepository sr;
	
	 @Override
	    public Shop saveShop(Shop shop) {
	        return sr.save(shop);
	    }

	@Override
	public List<Shop> fetchShopList() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Shop fetchShopById(Long shopId) {
		// TODO Auto-generated method stub
		return sr.findById( shopId).get();
	}

	@Override
	   public void deleteShopById(Long shopId ) {
	       sr.deleteById(shopId);
	   }


	   @Override
	   public Shop updateShop(Long shopId, Shop shop) {
	       Shop shoDB = sr.findById(shopId).get();

	       if(Objects.nonNull(shop.getShopName()) &&
	       !"".equalsIgnoreCase(shop.getShopName())) {
	           shoDB.setShopName(shop.getShopName());
	       }

	       
	       return sr.save(shoDB);
	   }

	    
	    

	}

