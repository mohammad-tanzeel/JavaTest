package com.annotationTest;

public class Basic {

	static  int x=1;
	public static void print() {
		System.out.println("From the print method...."+x);
	}
	
	public static void main(String[] args) {
		x = 2;
		Basic.print();

	}

}
