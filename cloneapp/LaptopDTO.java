package com.xworkz.dto.cloneapp;

public class LaptopDTO  implements Cloneable  {
 private String brand;
 private int cost; 
 
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "LaptopDTO [brand=" + brand + ", cost=" + cost + "]";
}
@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}