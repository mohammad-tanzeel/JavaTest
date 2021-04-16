package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ExecutorService executor = Executors.newFixedThreadPool(10);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
//        executorService.submit(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("ExecutorService");
//			}
//		});
//        executorService.shutdown();
        
        
        Future future = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        try {
        future.get();  //returns null if the task has finished correctly.
        } catch (Exception e) {
			// TODO: handle exception
		}
	}

}
