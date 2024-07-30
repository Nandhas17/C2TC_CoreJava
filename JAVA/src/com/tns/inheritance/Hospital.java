package com.tns.inheritance;

public class Hospital {
	void demo() {
		System.out.println("SRM");
	}

}
class Doctor extends Hospital{
	void demo1() {
		System.out.println("NANDHAS");
	}
}
class Patient extends Hospital{
	void demo2(){
		System.out.println("RAKESH");
	}
}