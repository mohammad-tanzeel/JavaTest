package com.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorScheduledRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        
        task1();
        Runnable task2 = () -> System.out.println("Task2 is running");
        
        ses.schedule(task2, 5, TimeUnit.SECONDS);

        task3();
	}
	
	public static void task1() {
        System.out.println("Running task1...");
    }

	public static void task3() {
        System.out.println("Running task3...");
    }


}
