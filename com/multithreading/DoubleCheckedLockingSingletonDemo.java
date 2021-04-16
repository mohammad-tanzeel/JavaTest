package com.multithreading;

class DoubleCheckedLockingSingleton {

	private static volatile DoubleCheckedLockingSingleton instance;

	private DoubleCheckedLockingSingleton() {
	}

	public static synchronized DoubleCheckedLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingSingleton();
					System.out.println("Instance Created");
				}
			}

		}
		return instance;
	}

}

public class DoubleCheckedLockingSingletonDemo {

	static DoubleCheckedLockingSingleton s1 = null, s2 = null;

	public static void main(String s[]) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			s1 = DoubleCheckedLockingSingleton.getInstance();
		});
		Thread t2 = new Thread(() -> {
			s2 = DoubleCheckedLockingSingleton.getInstance();
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		if (s1 == s2) {
			System.out.println("Same/Single Object");
		} else {
			System.out.println("Not Singleton Object");
		}
	}

}
