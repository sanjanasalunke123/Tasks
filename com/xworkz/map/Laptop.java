package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Laptop {

	public static void main(String args[]) {
		
		Map<String,String> map= new HashMap();
		
		map.put("dell","inspiron 15-3567" );
		map.put("lenavo","intel 16-3597" );
		map.put("hp","ins 10-3507" );
		
		System.out.println(map.size());
		String value=map.get("dell");
		System.out.println(value);
		
		boolean contains = map.containsValue(421);
		System.out.println(contains);
		
		Set<String>Keys=map.keySet();
		Keys.forEach((e)->{
			System.out.println(e);
		});
	}
	
				
}			
			
		
	

