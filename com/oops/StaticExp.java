package com.oops;


class StaticClass{
	
	public static int test_var = 10;
	
}

public class StaticExp {
	
	public static int Testvar =1;
	
	public static void show() {
		System.out.println("I am in static");
	}
	public static void main(String[] args) {
			show();
		System.out.println(Testvar);
		System.out.println(StaticClass.test_var);
	}

}
