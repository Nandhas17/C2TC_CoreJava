package com.tns.inheritance;

public class Student {
	void display() {
		System.out.println("NANDHAS");
		
	}

}
class Age extends Student
{
	void out() {
		System.out.println("20");
		
	}
}
class College extends Age
{
	void print() {
		System.out.println("REC");
		
	}
}