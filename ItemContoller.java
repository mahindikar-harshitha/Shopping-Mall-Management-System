package com.si.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.si.demo.entity.Item;
import com.si.demo.service.ItemSerivce;

@RestController

public class ItemContoller {

	@Autowired
	private ItemSerivce s1;
	
	@PostMapping("/items")
	public Item saveItem(@RequestBody Item item) {
		
		return s1.saveItem(item);
	}
	@GetMapping("/items")
    public List<Item> fetchItemList() {
        
        return s1.fetchItemList();
    }

	
	@GetMapping("/items/{id}")
	public Item fetchItemById(@PathVariable("id") Long Id) {
		return s1.fetchItemById(Id);
	}
	@DeleteMapping("/items/{id}")
    public String deleteItemById(@PathVariable("id") Long Id) {
        s1.deleteItemById(Id);
        return "Item deleted Successfully!!";
	}
	@PutMapping("/items/{id}")
	public Item updateItem(@PathVariable("id") Long Id,@RequestBody Item item) {
		return s1.updateItem(Id, item);
	}
}

