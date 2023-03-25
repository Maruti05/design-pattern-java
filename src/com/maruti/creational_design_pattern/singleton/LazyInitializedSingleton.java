package com.maruti.creational_design_pattern.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	public LazyInitializedSingleton() {	}
	
	
	public static LazyInitializedSingleton getInstance() {
		if(instance==null)
			instance=new LazyInitializedSingleton();
		return instance;
		
	}

}
