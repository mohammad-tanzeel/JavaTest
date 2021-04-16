package com.java8;

public class LambdaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable tr1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Task1 Started");
			}
		};
		
		Runnable tr2 = () ->{
			System.out.println("Task2 Started");
		};
		
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		
		t1.start();
		t2.start();
	}
}
