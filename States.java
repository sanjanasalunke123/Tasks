package com.xworkz.map2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class States {
 public static void main(String args[]) {
	 
	 Map<String,Integer>States= new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
	 System.out.println("ascending order...../n");
	 States.put("Karnataka", 30);
	 States.put("Kerala", 15);
	 States.put("goa", 23);
	 States.put("maharashtra", 34);
	 States.put("tamilnadu", 36);
	 
	 Set<String>keys=States.keySet();
	 
	 keys.forEach((v)->System.out.println(v +"  "+States.get(v)));
	 Collection<Integer>values=States.values();
	 values.forEach((l)->System.out.println(l));
	 
	 //entry set
	 Set<Map.Entry<String, Integer>> entrySet=States.entrySet();
	 entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
	 
	 Iterator<Map.Entry<String,Integer>> itr=entrySet.iterator();
	 System.out.println("=============");
	 while(itr.hasNext()) {
		 Map.Entry<String, Integer>entry=itr.next();
		 System.out.println(entry.getKey());
		 System.out.println(entry.getValue());
	 }
 }
}
