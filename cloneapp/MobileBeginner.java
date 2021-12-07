package com.xworkz.dto.cloneapp;

public class MobileBeginner {

	public static void main(String args[])throws CloneNotSupportedException {
		
		
		MobileappDTO mb1= new MobileappDTO();
		mb1.setName("lenavo");
		mb1.setCore("intel");
		mb1.setCost(12000);
		mb1.setColor("gray");
		mb1.setRAM(4);
		
		MobileappDTO mb2 =(MobileappDTO)mb1.clone();
		System.out.println(mb2); 
	}
}
