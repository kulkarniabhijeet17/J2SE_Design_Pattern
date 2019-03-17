package com.abhijeet.creational.builder;

public class Demo {
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setOs("Andriod").build();
	}
}