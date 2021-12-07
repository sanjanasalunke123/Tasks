package com.xworkz.dto.cloneapp;

public class InstituteStarter {
 public static void main(String args[])throws CloneNotSupportedException {
	 
	 
	 Institue is1 =new Institue();
	 is1.setClgName("prism");;
	 is1.setLocation("Dharwad");
	 is1.setNoOfStudents(300);
	 is1.setPhoneno(9809680);
	 is1.setPrincipleName("timappa");
	 
	 Institue is2 = (Institue)is1.clone();
	 System.out.println(is1);
 }
}
