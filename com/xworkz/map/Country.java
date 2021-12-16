package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Country {


	public static void main(String args []) {
		
		Map<String,Integer> map =new HashMap<>();
		map.put("IND", 92);
		map.put("Turkey",256);
		map.put("Sweden",567);
		map.put("Sudia",966);
		map.put("Russia",7);
		map.put("japan",420);
		
		System.out.println(map.size());
		Integer value=map.get("IND");
		System.out.println(value);
		
		boolean contains = map.containsValue(421);
		System.out.println(contains);
		
		Set<String>Keys=map.keySet();
		Keys.forEach((e)->{
			System.out.println(e);
		});
	}
	
				
}			
				
		
		
		
	

	
		
	

