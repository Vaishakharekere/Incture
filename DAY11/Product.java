package com.demo.DAY11;

public class Product {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	private	double price;
	private boolean isAvailable;
	
	public Product(String name,double price,boolean isAvailable) {
		this.name=name;
		this.price=price;
		this.isAvailable=isAvailable;
		}
	@Override
	public String toString() {
		return "Product :"+ name + ", Price : " + price ;
	}

}
