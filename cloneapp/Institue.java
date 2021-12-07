package com.xworkz.dto.cloneapp;

public class Institue implements Cloneable {
 private String principleName;
 private String clgName;
 private String location;
 private int noOfStudents;
 private double phoneno;
 
@Override
public String toString() {
	return "Institue [principleName=" + principleName + ", clgName=" + clgName + ", location=" + location
			+ ", noOfStudents=" + noOfStudents + ", phoneno=" + phoneno + "]";
}
public String getPrincipleName() {
	return principleName;
}
public void setPrincipleName(String principleName) {
	this.principleName = principleName;
}
public String getClgName() {
	return clgName;
}
public void setClgName(String clgName) {
	this.clgName = clgName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNoOfStudents() {
	return noOfStudents;
}
public void setNoOfStudents(int noOfStudents) {
	this.noOfStudents = noOfStudents;
}
public double getPhoneno() {
	return phoneno;
}
public void setPhoneno(double phoneno) {
	this.phoneno = phoneno;
}
@Override
public  Object clone() throws CloneNotSupportedException {
	return super.clone();
  
}
}
