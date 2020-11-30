package com.dukaandari.dukaan;

import javax.persistence.*;

@Entity
@Table(name= "shop")
public class Dukaan {
	@Id
	long shopkeeper;
	long customer;
	int take;
	int give;
	public Dukaan() {
		super();
	}
	public Dukaan(long shopkeeper, long customer, int take, int give) {
		super();
		this.shopkeeper = shopkeeper;
		this.customer = customer;
		this.take = take;
		this.give = give;
	}
	public long getShopkeeper() {
		return shopkeeper;
	}
	public void setShopkeeper(long shopkeeper) {
		this.shopkeeper = shopkeeper;
	}
	public long getCustomer() {
		return customer;
	}
	public void setCustomer(long customer) {
		this.customer = customer;
	}
	public int getTake() {
		return take;
	}
	public void setTake(int take) {
		this.take = take;
	}
	public int getGive() {
		return give;
	}
	public void setGive(int give) {
		this.give = give;
	}
	
}
