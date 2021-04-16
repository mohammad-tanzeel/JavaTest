package com.multithreading;

import java.util.*;
//import com.sun.java_cup.internal.runtime.Symbol;

class Processer extends Thread{
	
	private volatile boolean running = true;
	
	public void run() {
		
		while(running){
			System.out.println("Hello ");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
		running = false;
	}
}
public class SyncExample1 {
	
	public static void main(String[] args) {
		
		Processer proc1 = new Processer();
		proc1.start();
		
		System.out.println("Press return to stop...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutdown();
	}
}
