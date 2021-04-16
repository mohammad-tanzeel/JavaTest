package com.oops;


public  class A {

    public void printName(){

        System.out.println("Value-A");

    }

}

public class B extends A{

    public void printName(){

        System.out.println("Value-B");

    }

}

public class C extends A{

    public void printName(){

        System.out.println("Value-C");

    }

}


public class TestInheritanceExp{

     public static void main (String[] args) {

         B b = new B();

         C c = new C();

//        b = c;

         newPrint(b);

     }