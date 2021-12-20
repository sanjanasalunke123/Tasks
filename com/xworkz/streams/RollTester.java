package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollTester {

	public static void main(String args[])  {
		
	Stream<Integer>roll=Stream.of(1,2,3,4,5,6,7,8,10,11,67,34,78,98,67,90);
	
	List<Integer> tempList =roll
			.filter((p)->p>1)
			.sorted()
			
			.collect(Collectors.toList());
	tempList.forEach((p)->System.out.println(p));
		
	}
	
}
