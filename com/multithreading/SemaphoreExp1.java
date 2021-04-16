package com.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Semaphore sm = new Semaphore(0);
		
		sm.acquire();
		
		System.out.println("Available permit "+ sm.availablePermits());
	}

}
