package com.designPattern;

import java.lang.reflect.Constructor;

public class SingletonClassBreak {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		LazySingleton instance1 = LazySingleton.getInstance();
		
//		LazySingleton instance2 = (LazySingleton) instance1.clone();
		System.out.println(instance1.hashCode());
		
		
		
//		System.out.println(instance2.hashCode());
		
	}
	
}

