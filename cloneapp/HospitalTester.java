package com.xworkz.dto.cloneapp;

public class HospitalTester {

	public static void main(String argd[]) throws CloneNotSupportedException {
		
		HospitalsDTO hs=new HospitalsDTO();
		hs.setDoctorName("ramshetty");
		hs.setNoOfPatients(100);
		hs.setPatientName("sanju");
		
		HospitalsDTO hs1 =(HospitalsDTO)hs.clone();
		System.out.println(hs1);
		
	}
}
