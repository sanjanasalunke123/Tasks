package com.xworkz.DAOapp.email;

public class SearchIn implements EmailName {

	@Override
	public boolean find(String arg1, String arg2) {
		String st=arg1.substring(arg1.length()-2,arg1.length());
		if(arg1.equals(arg2)) {
			return true;
	
	}
return false;
}
}