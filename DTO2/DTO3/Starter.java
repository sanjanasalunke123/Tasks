package com.xworkz.dto.DTO2.DTO3;

public class Starter {
public static void main(String args []) throws CloneNotSupportedException {
	
	StadiumApp st1 =new StadiumApp();
	st1 .setCost(5000);
	st1.setLocation("Bangalore");
	st1.setMataches("indvspak");
	st1.setName("cinnaswamikreedagana");
	st1.setNoOfSeats(1000);
	
	StadiumApp st2= (StadiumApp)st1.clone();
	System.out.println(st2);  
	
}
}
