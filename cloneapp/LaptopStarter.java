package com.xworkz.dto.cloneapp;

public class LaptopStarter {
	public static void main(String args[])throws CloneNotSupportedException {
		
	

 LaptopDTO l1=new LaptopDTO();
 l1.setBrand("dell");
 l1.setCost(89000);
 
 LaptopDTO l2 =(LaptopDTO)l1.clone();
 System.out.println(l1);
}
}
