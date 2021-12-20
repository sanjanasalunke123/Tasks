package com.xworkz.map2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FamilyStarter {
	public static void main(String[] args) {
	//Ascending order	
	//Map<String,Integer>familyMemberMap=new TreeMap<String,Integer>((e1,e2)->e1.compareTo(e2));
	
	//Descending order
	Map<String,Integer>familyMemberMap=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
	familyMemberMap.put("Aishwarya",9);
	familyMemberMap.put("Vidyashree",12);
	familyMemberMap.put("Sanjana",7);
	familyMemberMap.put("Akshu",10);
	familyMemberMap.put("Tejashwini",8);
	familyMemberMap.put("Swati",7);
	familyMemberMap.put("Ashwini",6);
	familyMemberMap.put("Ranjita",5);
	familyMemberMap.put("Priya",5);
	familyMemberMap.put("Madhu",9);
	
	Set<String> set=familyMemberMap.keySet();
	
     set.forEach((l)->System.out.println(l));
	
	Collection<Integer>values=familyMemberMap.values();
	values.forEach((v)->System.out.println(v));
	
	Set<Map.Entry<String, Integer>> entrySet=familyMemberMap.entrySet();
	entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
	
	Iterator<Map.Entry<String,Integer>> itr= entrySet.iterator();
	System.out.println("==============");
	while(itr.hasNext()) {
		Map.Entry<String, Integer>entry=itr.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	
	}
	
	}
}

