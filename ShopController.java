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

import com.si.demo.entity.Shop;
import com.si.demo.service.ShopService;




@RestController
public class ShopController {
	
	@Autowired
    private ShopService ss;
	

    @PostMapping("/shops")
    public Shop saveShop(@RequestBody Shop s) {
       
        return ss.saveShop(s);
    }
    
    
    @GetMapping("/shops")
    public List<Shop> fetchShopList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return ss.fetchShopList();
    }
    
    
 
 @GetMapping("/shops/{id}")
    public Shop fetchShopById(@PathVariable("id") Long shopId)
            {
        return ss.fetchShopById(shopId);
    }
    
 @DeleteMapping("/shops/{id}")
    public String deleteShopById(@PathVariable("id") Long shopId) {
	 ss.deleteShopById(shopId);
        return "Shop deleted Successfully!!";
    }
 @PutMapping("/shops/{id}")
 public Shop updateShop(@PathVariable("id") Long shopId,
                                    @RequestBody Shop shop) {
     return ss.updateShop(shopId,shop);
 }
 
}


