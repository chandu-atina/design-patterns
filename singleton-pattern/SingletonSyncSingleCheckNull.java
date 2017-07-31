package com.patterns.design.singleton;

/*
 * Singleton instance with synchronized block in getInstance() method.
 * 1. Private constructor (Cannot be instantiated outside the class)
 * 2. public static method with synchronized block to instantiate object
 * 3. Checks for null before creating an instance before synchronized block.
 * 
 * Note : Still not thread safe. There is a chance that two threads pass 
 * the null check and each thread initialize two instances in synchronized block 
 */
public class SingletonSyncSingleCheckNull {

	private static SingletonSyncSingleCheckNull instance;

	private SingletonSyncSingleCheckNull() {

	}

	public static SingletonSyncSingleCheckNull getInstance() {
		if (instance == null) {
			synchronized (SingletonSyncSingleCheckNull.class) {
				instance = new SingletonSyncSingleCheckNull();
			}
		}
		return instance;
	}
}