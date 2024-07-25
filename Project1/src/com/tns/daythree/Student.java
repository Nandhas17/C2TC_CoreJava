package com.tns.daythree;

public class Student {
	String name;
	int RegNo;
	int MobileNo;
	String Dpart;
	float per;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	public String getDpart() {
		return Dpart;
	}
	public void setDpart(String dpart) {
		Dpart = dpart;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", RegNo=" + RegNo + ", MobileNo=" + MobileNo + ", Dpart=" + Dpart + ", per="
				+ per + "]";
	}
	
	
	

}
