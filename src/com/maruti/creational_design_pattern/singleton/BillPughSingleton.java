package com.maruti.creational_design_pattern.singleton;

public class BillPughSingleton {

	public BillPughSingleton() {
	}

	private static class BillPughSingletonHelper {
		private static final BillPughSingleton INSTANCE=new BillPughSingleton();
		
	}
	public static BillPughSingleton getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}
}
