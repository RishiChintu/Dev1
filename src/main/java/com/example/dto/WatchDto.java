package com.example.dto;

public class WatchDto {
	
	private int id;
	private String brand;
	private String type;
	private String waterResistance;
	private int price;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWaterResistance() {
		return waterResistance;
	}
	public void setWaterResistance(String waterResistance) {
		this.waterResistance = waterResistance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
