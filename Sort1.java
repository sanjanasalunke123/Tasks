package com.xworkz.SortingArray;
// collection to array......
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Sort1 {

public static void main(String []args) {
	
	Collection  collection = new ArrayList<>();
	collection.add("Tom");
	collection.add("mike");
	collection.add("peter");
	
	Object[] obj=collection.toArray();
	for(int i=0;i<obj.length;i++) {
	}
	
    System.out.println(collection.size());
	collection.forEach(System.out::println);
	 
		
	
}
}
