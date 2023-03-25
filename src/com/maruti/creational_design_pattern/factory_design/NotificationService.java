package com.maruti.creational_design_pattern.factory_design;

public class NotificationService {
public static void main(String[] args) {
	 NotificationFactory notificationFactory = new NotificationFactory();
     Notification notification = notificationFactory.createNotification("EMAIL");
     notification.notifyUser();
}
}
