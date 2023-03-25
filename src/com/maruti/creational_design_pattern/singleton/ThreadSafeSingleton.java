package com.maruti.creational_design_pattern.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton  instance;
	
	public ThreadSafeSingleton() {	}

	public static synchronized ThreadSafeSingleton  getInstance() {
		if(instance==null)
			instance=new ThreadSafeSingleton();
		//return instance==null?new ThreadSafeSingleton():instance;
		return instance;
		
	}
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton();
	            }
	        }
	    }
	    return instance;
	}
}
