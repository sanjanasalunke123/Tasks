package com.xworkz.SortingArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountriesSort {
	
// convert ArrayList to array using toArray() method
public static  void main (String a[]){
	
List<String>oList = new ArrayList<String>();

		oList.add("ramesh");
		oList.add("Suresh");
		oList.add("Mailar");
		
		String[] str = oList.toArray(new String[oList.size()]);
		
		for(String sele : str) {
			System.out.println(sele);
		}
}
}

