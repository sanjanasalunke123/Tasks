package com.xworkz.DAOapp.pg;

public class PGCaller {
			public static void main(String[] args) {
				String pgName="Khushi PG";
				pgName=pgName.replace("", "");
				System.out.println(pgName);
				
				PGDAO dao = new PGDAO();
				dao.save("Khushi PG");
				dao.save("Sai PG");
				dao.save("Amrutha PG");
				dao.save("Manjunath PG");
				dao.save("Sahana PG");
				
				boolean found = dao.find("Khushi PG");
				System.out.println(found);
				
				found=dao.findByCaseInSensitive("sai PG");
				System.out.println(found);
				
				found=dao.findByCaseInSensitiveAndTrimmed("khushiPG");
				System.out.println(found);
				
			}

		
}

