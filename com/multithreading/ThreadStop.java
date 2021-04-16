package com.multithreading;

class MyTestThread implements Runnable {

	Thread t;
	
	MyTestThread(){
		
		t = new Thread(this);
		System.out.println("New Thread "+ t);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
        while (!Thread.interrupted()) { 
            System.out.println("Thread is running"); 
        } 
        System.out.println("Thread has stopped.");

	}
	
}

public class ThreadStop {
	
	public static void main(String args[]) 
    { 
		
    }
}
