package com.xworkz.dto.cloneapp;

public class Canteens implements Cloneable {
 private  String OwnerName;
 private String canttenName;
 private int noOfItems;
public String getOwnerName() {
	return OwnerName;
}
public void setOwnerName(String ownerName) {
	OwnerName = ownerName;
}
public String getCanttenName() {
	return canttenName;
}
public void setCanttenName(String canttenName) {
	this.canttenName = canttenName;
}
public int getNoOfItems() {
	return noOfItems;
}
public void setNoOfItems(int noOfItems) {
	this.noOfItems = noOfItems;
}
@Override
public String toString() {
	return "Canteens [OwnerName=" + OwnerName + ", canttenName=" + canttenName + ", noOfItems=" + noOfItems + "]";
}
 
@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}