package com.multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Service implements Runnable{
	
	int i;
	
	public Service(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(i+" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class ExecutorServiceRunable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(new Date());
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(2);
		List<Future<String>> futurelist = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			futurelist.add((Future<String>) es.submit(new Service(i)));
		}
		es.shutdown();
		es.awaitTermination(1000, TimeUnit.SECONDS);
		System.out.println(new Date());
		for(Future<String> fut:futurelist)
			System.out.println(fut.get());
	}

}
