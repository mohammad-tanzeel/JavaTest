package com.designPattern;

public class SingletonExam {
	
	   private static SingletonExam obj=null;
	   
	   private SingletonExam() {
		   
	   }
	   
	   public static SingletonExam getInstance() {
		   
		   if(obj==null) {
			   obj = new SingletonExam();
		   }
		   return obj;
	   }
	   
	   public void display() {
		   System.out.println("Singleton class example");
	   }
	   
	   public static void main(String args[]){
			//Object cannot be created directly due to private constructor 
		        //This way it is forced to create object via our method where
		        //we have logic for only one object creation
		    SingletonExam myobject= SingletonExam.getInstance();
			myobject.display();
			
			SingletonExam myobject1= SingletonExam.getInstance();
			myobject1.display();

	   }
}
