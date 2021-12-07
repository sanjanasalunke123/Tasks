package com.xworkz.dto.cloneapp;

public class TravelsStarter {
  public static void main(String args[]) throws CloneNotSupportedException {
	  
	  Travels t1 =new Travels ();
	  t1.setOwnerName("Sachin");
	  t1.setSeats(1000);
	  t1.setTravelsName("sugama Travels");
	  
	  Travels t2 = (Travels)t1.clone();
	  System.out.println(t1);
	  
  }
}
