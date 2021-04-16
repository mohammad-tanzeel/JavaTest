package com.java8;


public class FunctionalInterfaceExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalInterfaceTest FIO = () -> System.out.println("Hello Functional Interface");
		FIO.sum();
		FIO.display();
	}

}
