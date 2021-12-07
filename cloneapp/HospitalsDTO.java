package com.xworkz.dto.cloneapp;

public class HospitalsDTO implements Cloneable{
 private String patientName;
 private String doctorName;
 private int noOfPatients;
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public int getNoOfPatients() {
	return noOfPatients;
}
public void setNoOfPatients(int noOfPatients) {
	this.noOfPatients = noOfPatients;
}
@Override
public String toString() {
	return "HospitalsDTO [patientName=" + patientName + ", doctorName=" + doctorName + ", noOfPatients=" + noOfPatients
			+ "]";
}
@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
