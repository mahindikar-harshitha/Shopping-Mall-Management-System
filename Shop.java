package com.si.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Shop {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long shopId;
	private String shopName;
	
	
	
	public long getShopId() {
		return shopId;
	}



	public void setShopId(long shopId) {
		this.shopId = shopId;
	}



	public String getShopName() {
		return shopName;
	}



	public void setShopName(String shopName) {
		this.shopName = shopName;
	}



	public Shop() {
		super();
	}



	public Shop(long shopId, String shopName) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
	}



	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + "]";
	}

}
