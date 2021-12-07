package com.xworkz.dto.cloneapp;

public class MobileappDTO implements Cloneable {

	private String name;
	private int cost;
	private String color;
	private int RAM;
	private String core;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	
	@Override
	public String toString() {
		return "MobileappDTO [name=" + name + ", cost=" + cost + ", color=" + color + ", RAM=" + RAM + ", core=" + core
				+ "]";	
	
}
	@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
}
	
}
