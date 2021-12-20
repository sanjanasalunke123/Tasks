package com.xworkz.map2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MovieTester {
	public static void main(String[] args) {
		//Ascending order	
	Map<String,Double>movieRatingMap=new TreeMap<String,Double>((e1,e2)->e1.compareTo(e2));
		
		//Descending order
	//Map<String,Double>movieRatingMap=new TreeMap<String,Double>((e1,e2)->e2.compareTo(e1));
		movieRatingMap.put("Ninna Sanihake",7.9);
		movieRatingMap.put("Sakath",8.6);
		movieRatingMap.put("Salaga",7.4);
		movieRatingMap.put("Yuvaratna",6.7);
		movieRatingMap.put("Roberrt",6.6);
		movieRatingMap.put("Milana",8.1);
		movieRatingMap.put("GentleMen",7.0);
		movieRatingMap.put("Dia",8.2);
		movieRatingMap.put("Kirik Party",8.3);
		movieRatingMap.put("Kotigobba 2",6.9);
		
		Set<String> set=movieRatingMap.keySet();
		
	     set.forEach((l)->System.out.println(l));
		
		Collection<Double>values=movieRatingMap.values();
		values.forEach((v)->System.out.println(v));
		
		Set<Map.Entry<String, Double>> entrySet=movieRatingMap.entrySet();
		entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
		
		Iterator<Map.Entry<String,Double>> itr= entrySet.iterator();
		System.out.println("==============");
		while(itr.hasNext()) {
			Map.Entry<String,Double>entry=itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
		}
		
		}
	}



