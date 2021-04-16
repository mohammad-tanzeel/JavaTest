package com.multithreading;

import java.security.PublicKey;

public class multithreadExam1 {

	public static void main(String args[]) {
		
		Task threadObj = new Task();
		threadObj.start();
		
		System.out.println("Programe started");
	}
}

class Task extends Thread{
	
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Number "+i);
		}
	}
}
