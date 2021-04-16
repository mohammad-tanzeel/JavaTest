package com.multithreading;

class Runner extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.println("Hello "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Example2 {
	
public static void main(String args[]) {
		
		System.out.println("Programe started");
		Runner runner1 =new Runner();
		runner1.start();
		
		Runner runner2 =new Runner();
		runner2.start();
		
	}
}
