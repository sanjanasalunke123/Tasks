package com.xworkz.dto.DTO2;


public class Filler {
	
 public static void main(String args[]) throws CloneNotSupportedException {
 
	 BottleApp ba1 = new BottleApp();
	  ba1.setCapacity("big");
	  ba1.setColor("red");
	  ba1.setCost(90);
	  ba1.setName("silver");
	  ba1.setSize(12);
	  
	  
	  BottleApp ba2 =(BottleApp)ba1.clone();
		System.out.println(ba2); 
 }
}
