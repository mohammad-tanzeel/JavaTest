package com.multithreading;

import java.util.concurrent.TimeUnit;

class Task implements Runnable{
	    private String name;
	 
	    public Task(String name) 
	    {
	        this.name = name;
	    }
	     
	    public String getName() {
	        return name;
	    }
	 
	    @Override
	    public void run() 
	    {
	        try
	        {
	            Long duration = (long) (Math.random() * 10);
	            System.out.println("Doing a task during : " + name);
	            TimeUnit.SECONDS.sleep(duration);
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	    }
//	}

}
