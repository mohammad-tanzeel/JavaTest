package com.multithreading;


class singletonMultiThread{
	
	private static singletonMultiThread instance;
	
	private singletonMultiThread() {
		
	}
	
	synchronized public static singletonMultiThread getinstance() {
		
		if(instance == null) {
			instance = new singletonMultiThread();
		}
		return instance;
	}
}
public class SingletonSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singletonMultiThread.getinstance());
	}

}
