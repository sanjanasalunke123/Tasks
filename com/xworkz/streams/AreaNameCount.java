package com.xworkz.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaNameCount {

	public static void main(String args []) {
		
		Stream<String> name= Stream.of("Badravathi","bellary","vilasapura","kempete","Sandur");
		
		List<String>tempList= name
				.map(String::toLowerCase)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
		
		System.out.println("desecending order");
	}
}
