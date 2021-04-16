package com.designPattern;

public class LazySingleton implements Cloneable {

	private static LazySingleton instance;

	private LazySingleton() {
		if(instance!=null) {
			throw new IllegalStateException();
		}
	}	
	
	public static synchronized LazySingleton getInstance() {
		if(instance==null) {
			return instance = new LazySingleton();
		} else {
			return instance;
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
	
	
}
