package com.test;

import org.omg.CORBA.PUBLIC_MEMBER;

 class Parent{
	
	public void print() {
		System.out.println("I am in Parent");
	}
}

 class ChildC extends Parent{
	 public void print() {
			System.out.println("I am in Child");
		}
 }

public class ClassExample4 {

		
	public static void main(String args[]) {
		Parent ch = new ChildC();
		Parent pr = new Parent();
		ch.print();
		pr.print();
	}
}
