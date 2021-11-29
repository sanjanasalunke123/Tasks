package com.xworkz.SortingArray;

import java.util.Arrays;

public class SortingArray {
  
	public static void main(String []args) {
		// sorting an array of primitive array.sort()
		
		int[] myArray= {10,70,68,90,56};
		System.out.println("before sorting =>"+ Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println("After sorting =>"+ Arrays.toString(myArray)); 
		
		
		//sorting char testring method//
		String[] strArray= {"s","A","N","J","A","N","A"};
		System.out.println("before sorting =>"+ Arrays.toString(strArray));
		Arrays.sort(strArray);
	     System.out.println("After sorting =>"+ Arrays.toString(strArray));
	
	
	
	
	
	
	}
}
