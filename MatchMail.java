package com.xworkz.DAOapp.email;

public class MatchMail implements EmailName {

	@Override
	public boolean find(String arg1, String arg2) {
		if( arg1.equals(arg2)) {
			return true;
		}
		
	
return false;
}
}