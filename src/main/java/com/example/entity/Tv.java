package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tv {
	@Id
	private int id;
	private String brand;
	private String displayType;
	private String displaySize;
	private int price;
	
    public Tv() {};
	
	public Tv(int id, String brand, String displayType, String displaySize, int price) { 

	super(); 

	this.id = id; 

	this.brand = brand; 

	this.displayType = displayType; 

	this.displaySize = displaySize; 

	this.price = price; 

	} 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
