package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PincodeBeginner {

	public static void main(String args[]) {
		
		Stream<Integer> pincode =Stream.of(587313,585102,587313,587413,567856,567823,587435,589870,583452,509780,567998);
		
		
		List<Integer> tempList = pincode
				.filter((p)->p>1)
				.sorted()
				
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
			
		}
		
	}

	
	

