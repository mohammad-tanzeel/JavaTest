package com.designPattern;

public class SingletonClassExp2 {

	   public static void main(String[] args) {

	SingletonClass obj = SingletonClass.getInstance();
	SingletonClass obj1 = SingletonClass.getInstance();
	System.out.println(obj);
//	System.out.println(obj);
    System.out.println(obj1);
	   }
}

class SingletonClass {
	   public static SingletonClass obj = null;
	   
	   private SingletonClass() {
		   
	   }
	   
	   public static SingletonClass getInstance() {
		   if(obj==null) {
			   obj = new SingletonClass();
		   }
		   return obj;
	   }
}