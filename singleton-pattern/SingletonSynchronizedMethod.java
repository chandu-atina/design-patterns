package com.patterns.design.singleton;

/*
 * Singleton pattern with Synchronized getInstance() method.
 * 1. Private constructor (Cannot be instantiated outside the class)
 * 2. public synchronized static method to return the instance
 * 3. Checks for null before creating an instance
 * 
 * Note : Expensive approach. Each access to Singleton requires acquisition of lock,
 * but in reality we need lock only when initializing instance
 */
public class SingletonSynchronizedMethod {
	
	private static SingletonSynchronizedMethod instance;
	
	private SingletonSynchronizedMethod(){
		
	}

	public synchronized static SingletonSynchronizedMethod getInstance(){
		if (instance == null) {
			instance = new SingletonSynchronizedMethod();
		}
		return instance;
	}
}
