package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Continent {

	public static void main(String args[]) {
		
		Map<String,Integer>map=new HashMap();
		map.put("africa", 54);
		map.put("asia", 53);
		map.put("europe", 51);
		map.put("north america", 23);
		map.put("oceania", 13);
		System.out.println(map.size());
		Integer value=map.get("asia");
		System.out.println(value);
		
		boolean contains = map.containsValue(421);
		System.out.println(contains);
		
		Set<String>Keys=map.keySet();
		Keys.forEach((e)->{
			System.out.println(e);
		});
	}
	
				
}			
			
	

