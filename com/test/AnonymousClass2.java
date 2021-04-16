package com.test;

import java.util.ArrayList;


class B {
	
	public void show() {
		System.out.println("testfunction1 ");
	}
}
public class AnonymousClass2 {
	public static void main(String args[]) {
		B obj 
		= new B() 
		{
			public void show() {
				System.out.println("testfunction2 ");
			}
		};
		obj.show();
	}
}
