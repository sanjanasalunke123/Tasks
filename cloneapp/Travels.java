package com.xworkz.dto.cloneapp;

public class Travels  implements Cloneable{

	private  String TravelsName;
	private String ownerName;
	private int Seats;
	public String getTravelsName() {
		return TravelsName;
	}
	public void setTravelsName(String travelsName) {
		TravelsName = travelsName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getSeats() {
		return Seats;
	}
	public void setSeats(int seats) {
		Seats = seats;
	}
	@Override
	public String toString() {
		return "Travels [TravelsName=" + TravelsName + ", ownerName=" + ownerName + ", Seats=" + Seats + "]";
	}
	
	@Override
	public  Object clone() throws CloneNotSupportedException {
		return super.clone();
}
}
