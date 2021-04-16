package com.java8;

interface I{
	
	static void show() {
		System.out.println("Static call");
	}
}

interface Phone{
	void call();
	default void message() {
		System.out.println("I m inside message");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Test calling");
	}
	
}
public class DefaulTest {
	
	public static void main(String a[]) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
		I.show();
	}
	
}
