package com.dukaandari.shop;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class ShopController {
	@Autowired
	ShopService shopservice;
	
	@RequestMapping("/shop")
	@CrossOrigin(origins = "http://localhost:3000")
	public ArrayList<Shop> getAllShops(){
		return shopservice.getAllShops();
	}
	
	@RequestMapping("/shop/{mobileno}")
	@CrossOrigin(origins = "http://localhost:3000")
	public Shop getShop(@PathVariable long mobileno) {                              //get  or   read
		return shopservice.getShop(mobileno);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/shop")
	@CrossOrigin(origins = "http://localhost:3000")
	public void addShop(@RequestBody Shop shop) {                            //  post   or   create 
		shopservice.addShop(shop);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/shop")
	@CrossOrigin(origins = "http://localhost:3000")
	public void updateShop(@RequestBody Shop shop) {                            //  put   or   update 
		shopservice.updateShop(shop);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE , value="/shop/{mobileno}")
	@CrossOrigin(origins = "http://localhost:3000")
	public void deleteShop(@PathVariable long mobileno) {
		shopservice.deleteShop(mobileno);
	}
}
