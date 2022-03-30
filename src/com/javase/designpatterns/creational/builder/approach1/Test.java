package com.javase.designpatterns.creational.builder.approach1;

public class Test {
	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Amitabh01", "Test1234", "Amitabh", "Bacchan", "amitabh.bacchan01@gmail.com")
				.middleInitial("N").dob("01/06/1942").cellulare("1234567890").gender("M").build();
		System.out.println(user1.toString());

		User user2 = new User.UserBuilder("Sunny23", "Test1122", "Sunny", "Deol", "sunny.deol23@gmail.com")
				// no middleInitial
				// no cellulare
				.dob("23/09/1962").gender("M").build();
		System.out.println(user2.toString());

		User user3 = new User.UserBuilder("Akshay19", "Test2233", "Akshay", "Kumar", "akshay.kumar19@gmail.com")
				// no middleInitial
				// no cellulare
				// no dob
				// no gender
				.build();
		System.out.println(user3.toString());
	}
}