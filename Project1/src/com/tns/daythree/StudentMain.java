package com.tns.daythree;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
		s.name="NANDHAS";
		s.RegNo=48;
		s.MobileNo=2055;
		s.Dpart="CSE";
		s.per=8.5f;
		System.out.println(s);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		
		
		

	}

}
