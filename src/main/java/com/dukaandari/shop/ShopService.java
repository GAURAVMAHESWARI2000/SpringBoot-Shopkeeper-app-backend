package com.dukaandari.shop;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ShopService {
	@Autowired
	ShopRepo shoprepo;
	
	public ArrayList<Shop> getAllShops(){
		ArrayList<Shop> shop= new ArrayList<Shop>();
		shoprepo.findAll().forEach(shop :: add);
		return shop;
	}
	
	public Shop getShop(long mobileno) {                              //get  or   read
		return shoprepo.findById(mobileno).orElse(null);
	}
	
	public void addShop(Shop shop) {                            //  post   or   create 
		shoprepo.save(shop);
	}
	
	public void updateShop(Shop shop) {                            //  put   or   update 
		shoprepo.save(shop);
	}
	
	public void deleteShop(long mobileno) {
		shoprepo.deleteById(mobileno);
	}
	

}
