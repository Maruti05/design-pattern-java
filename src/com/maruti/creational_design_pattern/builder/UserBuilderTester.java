package com.maruti.creational_design_pattern.builder;


public class UserBuilderTester{
	
	public static void main(String[] args) {
		User user = new User.UserBuilder("Maruti","MN")
				.setAge(45)
				.build();
		System.out.println(user);
	}
}