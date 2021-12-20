package com.xworkz.map2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AreaDimension {
	public static void main(String[] args) {
		//Ascending order	
	Map<String,Integer>areaDimensionMap=new TreeMap<String,Integer>((e1,e2)->e1.compareTo(e2));
		
		//Descending order
	//Map<String,Integer>areaDimensionMap=new TreeMap<String,Integer>((e1,e2)->e2.compareTo(e1));
		areaDimensionMap.put("Mantri Square",93000);
		areaDimensionMap.put("Phoenix",93000);
	    areaDimensionMap.put("Lotus Mall",84000);
		areaDimensionMap.put("Orion Mall",79000);
		areaDimensionMap.put("VR",56000);
		areaDimensionMap.put("Park Square Mall",37000);
		areaDimensionMap.put("UB City Mall",9300);
		areaDimensionMap.put("Mak Mall",6500);
		areaDimensionMap.put("Elements Mall",24000);
		areaDimensionMap.put("Garuda Mall",26000);
		
		Set<String> set=areaDimensionMap.keySet();
		
	     set.forEach((l)->System.out.println(l));
		
		Collection<Integer>values=areaDimensionMap.values();
		values.forEach((v)->System.out.println(v));
		
		Set<Map.Entry<String, Integer>> entrySet=areaDimensionMap.entrySet();
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



