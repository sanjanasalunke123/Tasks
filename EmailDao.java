package com.xworkz.DAOapp.email;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmailDao {

	private Collection<String> emailNameCollection=new ArrayList<String>();
	public boolean save(String name) {
		Iterator itr=emailNameCollection.iterator();
		   while(itr.hasNext()) {
			   String tempName=(String)itr.next();
			 }
		return emailNameCollection.add(name);	
	}
	
	
public boolean find(EmailName search, String name) {
	 Iterator<String> itr= emailNameCollection.iterator();
	 while(itr.hasNext()) {
		 String tempName=itr.next();
		 if(search.equals(tempName)) {
			 return true;
		 }
	return emailNameCollection.contains(name);
	 }
	 return false;
	
}
public boolean find1(EmailName search, String name) {
	 Iterator<String> itr= emailNameCollection.iterator();
	 while(itr.hasNext()) {
		 String tempName=itr.next();
		 if(search.equals(tempName)) {
			 return true;
		 }
	return emailNameCollection.contains(name);
	 }
	 return false;
}
public boolean find3(EmailName search, String name) {
	 Iterator<String> itr= emailNameCollection.iterator();
	 while(itr.hasNext()) {
		 String tempName=itr.next();
		 if(search.equals(tempName)) {
			 return true;
		 }
	return emailNameCollection.contains(name);
	 }
	 return false;
}
}