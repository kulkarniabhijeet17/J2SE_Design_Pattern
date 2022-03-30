package com.javase.designpatterns.creational.prototype;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		UserDetails users = new UserDetails();
		users.getUsers();

		// Use the clone method to get the User object
		UserDetails users1;
		try {
			users1 = (UserDetails) users.clone();
			UserDetails users2 = (UserDetails) users.clone();
			List<String> list1 = users1.getUsersList();
			list1.add("Simba");
			List<String> list2 = users2.getUsersList();
			list2.remove("Don");

			System.out.println("users List: " + users.getUsersList());
			System.out.println("users1 List: " + list1);
			System.out.println("users2 List: " + list2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}