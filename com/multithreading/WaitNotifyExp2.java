package com.multithreading;

class Q {
	
	int num;
	
	boolean valueSet = false;
	
	public void put(int num) {
		
		while(valueSet) {
			
		}
		System.out.println("Put : "+ num);
		this.num = num;
	}
	
	public void get() {
		System.out.println("Put : "+ num);
	}
}

class Producer implements Runnable{

	Q q;
	
	
	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			q.put(i++);
			try { Thread.sleep(1000); } catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}


class Consumer implements Runnable{
	
	Q q;
	
	
	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			q.get();
			try { Thread.sleep(1000); } catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	
}
public class WaitNotifyExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Consumer(q);
		new Producer(q);
	}

}
