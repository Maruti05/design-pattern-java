package com.maruti.creational_design_pattern.singleton;

public class MainClass {
public static void main(String[] args) {
	
		//getEagerInitializedSingleton();
		//getStaticBlockInitialization();
		//getLazyInitializedSingleton();
		//getThreadSafeSingleton();
		//getInstanceUsingDoubleLocking();
		getBillPughSingleton();
}

private static void getBillPughSingleton() {
	BillPughSingleton instance = BillPughSingleton.getInstance();	
	System.out.println(instance);
	
	BillPughSingleton instance2 = BillPughSingleton.getInstance();	
	System.out.println(instance2);
}

private static void getInstanceUsingDoubleLocking() {
	ThreadSafeSingleton instance = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
	System.out.println(instance);
	
	ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
	System.out.println(instance2);
}

private static void getLazyInitializedSingleton() {
	LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
	System.out.println(instance);
	LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
	System.out.println(instance2);
	
}

private static void getThreadSafeSingleton() {
	ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
	System.out.println(instance);
	
	ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
	System.out.println(instance2);
	
}

private static void getStaticBlockInitialization() {
	StaticBlockInitialization instance = StaticBlockInitialization.getStaticBlockInitializationInstance();
	System.out.println(instance);
	StaticBlockInitialization instance2 = StaticBlockInitialization.getStaticBlockInitializationInstance();
	System.out.println(instance2);
}

private static void getEagerInitializedSingleton() {
	EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
	System.out.println(instance);
	EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
	System.out.println(instance2);
	
}
}
