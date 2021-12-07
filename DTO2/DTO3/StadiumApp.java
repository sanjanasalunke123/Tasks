package com.xworkz.dto.DTO2.DTO3;

public class StadiumApp implements Cloneable {

	private  String name;
	private int noOfSeats;
	private String mataches;
	private String location;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getMataches() {
		return mataches;
	}
	public void setMataches(String mataches) {
		this.mataches = mataches;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "StadiumApp [name=" + name + ", noOfSeats=" + noOfSeats + ", mataches=" + mataches + ", location="
				+ location + ", cost=" + cost + "]";
	}
	@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
