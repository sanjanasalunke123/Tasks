package com.xworkz.dto.cloneapp;

public class PensWritter {
 public static void main(String args[]) throws CloneNotSupportedException{
	 
	 Pens ps1 =new Pens();
	 
	 ps1.setName(null);
	 ps1.setNoOfPens(10);
	 
	 Pens ps2 =(Pens) ps1.clone();
	 System.out.println(ps1);
 }
}
