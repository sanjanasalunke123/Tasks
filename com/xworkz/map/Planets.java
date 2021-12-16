package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Planets {

	public static void main(String args[]) {
		
		Map<String,Integer>map=new HashMap();
		
		map.put("mercury", 0);
		map.put("venus", 0);
		map.put("earth", 1);
		map.put("jupiter", 53);
		map.put("neptune", 14);
		System.out.println(map.size());
		Integer value=map.get("earth");
		System.out.println(value);
		
		boolean contains = map.containsValue(421);
		System.out.println(contains);
		
		Set<String>Keys=map.keySet();
		Keys.forEach((e)->{
			System.out.println(e);
		});
	}
	
}			
			
			
	
