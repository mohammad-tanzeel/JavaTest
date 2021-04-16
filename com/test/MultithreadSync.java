package com.test;

public class MultithreadSync {
	
	private int balance =0;
	
	public static void main(String[] args) {
		MultithreadSync ms = new MultithreadSync();
		ms.goingThroughLife();
	}
	public void goingThroughLife() {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("before add call");
				for(int i=0; i<1000; i++) {
				add();
				}
			}
		});
		
	Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("before substract call");
				for(int i=0; i<1000; i++) {
				substract();
				}
			}
		});
		
	t1.start();
	t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Exception "+ e.getMessage());
			e.printStackTrace();
		}
	System.out.println("complete call "+ balance);
	}
	
	public void add() {
		System.out.println("add call");
		balance++;
		
	}
	
	public void substract() {
		System.out.println("Substract call");
		balance--;
	}
}
