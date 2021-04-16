package com.test;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;



public class ClassExample5 {

		
	public static void main(String args[]) {
		ArrayList<StringBuilder> mylist = new ArrayList<>();
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Python"); 
		StringBuilder sb3 = new StringBuilder("Scala"); 
		StringBuilder sb4 = new StringBuilder("Angular"); 
		
		mylist.add(sb1);
		mylist.add(sb2);
		mylist.add(sb3);
		mylist.add(sb4);
		
		mylist.remove(1);
		
		for(StringBuilder element:mylist )
			System.out.println(element);
		mylist.remove(sb3);
		mylist.remove(new StringBuilder("Angular"));
		for(StringBuilder element:mylist )
			System.out.println(element);
	}
}
