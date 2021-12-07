package com.xworkz.dto.cloneapp;

public class Mall implements Cloneable {

	private String mallName;
	private String mallOwnwr;
	private int noOfGtaes;
	private String customers;
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getMallOwnwr() {
		return mallOwnwr;
	}
	public void setMallOwnwr(String mallOwnwr) {
		this.mallOwnwr = mallOwnwr;
	}
	public int getNoOfGtaes() {
		return noOfGtaes;
	}
	public void setNoOfGtaes(int noOfGtaes) {
		this.noOfGtaes = noOfGtaes;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Mall [mallName=" + mallName + ", mallOwnwr=" + mallOwnwr + ", noOfGtaes=" + noOfGtaes + ", customers="
				+ customers + "]";
	}
	@Override
	public  Object clone() throws CloneNotSupportedException {
		return super.clone();
}
}
