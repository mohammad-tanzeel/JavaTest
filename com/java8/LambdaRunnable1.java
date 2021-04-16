package com.java8;

public class LambdaRunnable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(()->System.out.println("Runnable Lambda")).start();
		
		Runnable r1 = ()->{System.out.println("Runnable Lambda1");};
		
		new Thread(r1).start();
	}

}
