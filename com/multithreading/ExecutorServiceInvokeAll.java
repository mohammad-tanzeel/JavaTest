package com.multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class ServiceNew implements Callable{
	
	int i;
	
	public ServiceNew(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		System.out.println("in thread "+i);
		return "from thread  "+i;
	}
	
}


public class ExecutorServiceInvokeAll {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(new Date());
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(2);
		List<Callable<String>> callablelist = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			callablelist.add(new ServiceNew(i));
		}
		List<Future<String>> futurelist= es.invokeAll(callablelist);
		es.shutdown();
		es.awaitTermination(1000, TimeUnit.SECONDS);
		for(Future<String> fut:futurelist)
			System.out.println(fut.get());
		System.out.println(new Date());
		
	}

}
