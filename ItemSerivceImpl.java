package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.si.demo.entity.Item;
import com.si.demo.repository.ItemRepository;

@Service
public class ItemSerivceImpl implements ItemSerivce{
	
	@Autowired
	private ItemRepository r1;

	@Override
	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		return r1.save(item);
	}

	@Override
	public List<Item> fetchItemList() {
		// TODO Auto-generated method stub
		return r1.findAll();
	}

	@Override
	public Item fetchItemById(Long id) {
		// TODO Auto-generated method stub
		return r1.findById(id).get();
	}

	@Override
	public void deleteItemById(Long id) {
		// TODO Auto-generated method stub
		r1.deleteById(id);
	}

	@Override
	public Item updateItem(Long id, Item item) {
		// TODO Auto-generated method stub
		Item itemDB = r1.findById(id).get();

	       if(Objects.nonNull(item.getItemName()) &&
	       !"".equalsIgnoreCase(item.getItemName())) {
	           itemDB.setItemName(item.getItemName());
	       }

	       if(Objects.nonNull(item.getPrice()) && item.getPrice() > 0) {
	           itemDB.setPrice(item.getPrice());
	       }

	      
		return r1.save(itemDB);
	}
	
	
	

}
