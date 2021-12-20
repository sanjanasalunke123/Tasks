package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmCount {

	public static void main(String args[]) {
		
		
		
		Stream<Integer> atm= Stream.of(7022,8022,9071,8908,7654,8743,2345,7634,7674,9876,7654);
		List<Integer> tempList=atm 
				.filter((p)->p>6000)
				.sorted()
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
	}
}
