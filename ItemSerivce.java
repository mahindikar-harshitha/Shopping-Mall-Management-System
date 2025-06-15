package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Item;

public interface ItemSerivce {

	Item saveItem(Item item);

	List<Item> fetchItemList();

	Item fetchItemById(Long id);

	void deleteItemById(Long id);

	Item updateItem(Long id, Item item);

	



}
