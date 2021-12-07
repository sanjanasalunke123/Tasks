package com.xworkz.dto.cloneapp;

public class MallBeginner {

	public static void main(String args[]) throws CloneNotSupportedException {
		
		
		Mall m1 = new Mall();
		m1.setCustomers("thousand");
		m1.setMallName("sanjana mal");
		m1.setMallOwnwr("mailar rao");
		m1.setNoOfGtaes(6);
		
		Mall m2 = (Mall)m1.clone();
		System.out.println(m2);
	}
}
