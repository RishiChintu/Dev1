package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptops {
	@Id
	private int id;
	private String brand;
	private String os;
	private String processor;
	private int price;
	
	public Laptops() {}; 

	public Laptops(int id, String brand, String os, String processor, int price) { 

	super(); 

	this.id = id; 

	this.brand = brand; 

	this.os = os; 

	this.processor = processor; 

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
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
