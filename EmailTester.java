package com.xworkz.DAOapp.email;


public class EmailTester {

	public static void main(String a[]) {
		//String EmailName="sanjanasalunke383@gmail.com";
	//	System.out.println(EmailName);
		
	//	String EmailName1="patilaishu189@gmail.in";
	////	System.out.println(EmailName1);
		
		//String EmailName2="patilaishu19@gmail.in";
	//	System.out.println(EmailName2);
		
		EmailDao dao = new EmailDao();
		dao.save("sanjanasalunke383@gmail.com");
		dao.save("patilaishu189@gmail.in");
		dao.save("aishpatil23@gmail.com");
		
		
		EmailName na = new SearchCom();
		boolean found = dao.find(na,"sanjanasalunke383@gmail.com" );
		System.out.println(found);
		
		
		EmailName na1 = new SearchIn();
		boolean found1=dao.find(na1,"patilaishu189@gmail.in");
		System.out.println(found1);
		
		EmailName na3 =new MatchMail();
		boolean found3=dao.find(na3,"patilaishu19@gmail.in" );
		System.out.println(found3);//
		
	}
}
