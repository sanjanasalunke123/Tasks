package com.xworkz.dto.DTO2;

public class BottleApp implements Cloneable {

	private String name;
	private int cost;
	private String capacity;
	private  String color;
	private int size;
	
	@Override
	public String toString() {
		return "BottleApp [name=" + name + ", cost=" + cost + ", capacity=" + capacity + ", color=" + color + ", size="
				+ size + "]";
	}
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
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	
	}
	
	@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
	}
	

