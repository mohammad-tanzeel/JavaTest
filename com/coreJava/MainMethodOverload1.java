package com.coreJava;

public class MainMethodOverload1 {
	// Overloaded main() method 1
	// invoked when an int value is passed
    public static void main(String[] args) { 
        System.out.println("Hi Geek (from main)"); 
        MainMethodOverload1.main("Geek"); 
    } 
  
    // Overloaded main methods 
    public static void main(String arg1) { 
        System.out.println("Hi, " + arg1); 
        MainMethodOverload1.main("Dear Geek","My Geek"); 
    } 
    public static void main(String arg1, String arg2) { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
}