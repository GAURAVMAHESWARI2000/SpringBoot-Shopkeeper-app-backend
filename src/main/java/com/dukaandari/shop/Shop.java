package com.dukaandari.shop;

import javax.persistence.*;

@Entity
@Table(name= "dukaandari")
public class Shop {
	@Id
	long mobileno;
	String name;
	String password;
	public Shop() {
		super();
	}
	
	public Shop(long mobileno, String name, String password) {
		super();
		this.mobileno = mobileno;
		this.name = name;
		this.password = password;
	}

	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
