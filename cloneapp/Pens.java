package com.xworkz.dto.cloneapp;

public class Pens implements Cloneable {
 private String name;
 private int noOfPens;
 
@Override
public String toString() {
	return "Pens [name=" + name + ", noOfPens=" + noOfPens + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNoOfPens() {
	return noOfPens;
}
public void setNoOfPens(int noOfPens) {
	this.noOfPens = noOfPens;
}
@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
