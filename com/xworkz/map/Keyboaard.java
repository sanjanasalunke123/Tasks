package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Keyboaard {
public static void main(String args[]) {
	
	
	
	Map<String,Integer>map=new HashMap();
	map.put("compuetr keyboard", 104);
	map.put("numeric  keyboard", 84);
	map.put("qwerty keyboard", 101);
	map.put("mechnical keyboard", 53);
	
	System.out.println(map.size());
	Integer value=map.get("numeric  keyboard");
	System.out.println(value);
	
	boolean contains = map.containsValue(53);
	System.out.println(contains);
	
	Set<String>Keys=map.keySet();
	Keys.forEach((e)->{
		System.out.println(e);
	});
}

}			
		
		


