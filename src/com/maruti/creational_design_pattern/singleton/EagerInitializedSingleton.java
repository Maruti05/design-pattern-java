package com.maruti.creational_design_pattern.singleton;


/*Very simple to implement.
 May lead to resource wastage. Because instance of class is created always, whether it is required or not.
 CPU time is also wasted in creation of instance if it is not required.
 Exception handling is not possible.
 * 
 * */
public class EagerInitializedSingleton {
	
	private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
