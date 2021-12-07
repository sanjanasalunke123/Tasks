package com.xworkz.dto.cloneapp;

public class CanttenCleaner {
 public static void main(String args[]) throws CloneNotSupportedException {
	 
	 Canteens c1 =new Canteens();
	 c1.setCanttenName("udupi");
	 c1.setNoOfItems(100);
	 c1.setOwnerName("Sachin");
	 
	 Canteens c2 = (Canteens)c1.clone(); 
	 System.out.println(c2);
 }
}
