package com.maruti.creational_design_pattern.factory_design;

public class PushNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending a push notification");		
	}

}
