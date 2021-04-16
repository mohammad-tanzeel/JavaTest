package com.test;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;



public class ClassExample2 {

		
	public static void main(String args[]) {
		ArrayList<String> mylist = new ArrayList<>();
		String sb1 = new String("Java");
		String sb2 = new String("Python"); 
		String sb3 = new String("Scala"); 
		String sb4 = new String("Angular"); 
		
		mylist.add(sb1);
		mylist.add(sb2);
		mylist.add(sb3);
		mylist.add(sb4);
		
		mylist.remove(1);
		
		for(String element:mylist )
			System.out.println(element);
		mylist.remove(sb3);
		mylist.remove(new String("Angular"));
		for(String element:mylist )
			System.out.println(element);
	}
}
