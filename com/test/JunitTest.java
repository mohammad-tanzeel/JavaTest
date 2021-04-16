package com.test;

public class JunitTest {

//	public String concateStr(String str1, String str2) {
//		return  str1+str1;
//	}
//	
//	public String concateStr(String str1, String str2) {
//		return  str1+str1;
//	}
	
	public static void main(String args[]){
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }catch(ArithmeticException e){System.out.println(e.getMessage());}  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }  

}
