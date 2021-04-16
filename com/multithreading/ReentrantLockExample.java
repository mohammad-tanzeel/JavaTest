package com.multithreading;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;


class ThreadClass implements Runnable  {

	String task_name;   
	  //define ReentrantLock object 
	  ReentrantLock thrd_lck;   
	  //ThreadClass constructor initialized lock and task name
	  public ThreadClass(ReentrantLock r_lock, String t_name)   {   
	    thrd_lck = r_lock;   
	    task_name = t_name;   
	  }   
	  //thread run () method
	  public void run()    {   
	    boolean bool_val = false;   
	    while (!bool_val)   {   
	      //check for Outer Lock   
	      boolean tryLock_val = thrd_lck.tryLock();   
	      //  if lock is free, do the following   
	      if(tryLock_val)   {   
	        try   {   
	           for(int i=2;i<=6;i++) {  
	              if(i>=2)  {  
	                  thrd_lck.lock();  
	                  Thread thread_one = new Thread();  
	                  System.out.println("Thread Created.....");  
	                  if(i==3) {  
	                      thread_one.setName("Maint Thread2");  
	                      System.out.println("Thread Created.....");  
	                  }  
	              }  
	           if(i==4)  
	                  thrd_lck.unlock();     break;  
	          }  
	          System.out.println("ReentrantLock=&amp;amp;gt;Is locked after sleep(1500) : " + thrd_lck.isLocked());   
	          System.out.println("Work done for task : " + task_name );   
	          bool_val = true;   
	        }
	catch(Exception e)   
	        {   
	          e.printStackTrace();   
	        }   
	      }   
	      }   
	    }   	
}

public class ReentrantLockExample {
	
	  public static void main(String[] args)   
	  {   
		  ReentrantLock reentrant_lock = new ReentrantLock();
		  ExecutorService pool = Executors.newFixedThreadPool(2);
		  Runnable worker_thread = new ThreadClass(reentrant_lock, "ThreadJob");  
		  pool.execute(worker_thread);   
		    //shut down the pool
		    pool.shutdown(); 
		  
	  }
}
