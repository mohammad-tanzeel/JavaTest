package com.test;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;


interface A{
	void testfunction1();
	void testfunction2();
}

public class AnonymousClass1 {

		
	public static void main(String args[]) {
		
		A obj = new A() {

			@Override
			public void testfunction1() {
				// TODO Auto-generated method stub
				System.out.println("testfunction1 ");
			}

			@Override
			public void testfunction2() {
				// TODO Auto-generated method stub
				System.out.println("testfunction2 ");
				
			}
			
		};
		
		obj.testfunction1();
		obj.testfunction2();
		
	}
}
