package com.javase.designpatterns.creational.builder.approach2;

public class User {
	private final String userId; // required
	private final String password; // required
	private final String firstName; // required
	private final String lastName; // required
	private String middleInitial; // optional
	private String dob; // optional
	private final String email; // required
	private String cellulare; // optional
	private String gender; // optional

	public User(String userId, String password, String firstName, String lastName, String middleInitial, String dob,
			String email, String cellulare, String gender) {
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.dob = dob;
		this.email = email;
		this.cellulare = cellulare;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User: " + this.userId + ", " + this.password + ", " + this.firstName + ", " + this.lastName + ", "
				+ this.middleInitial + ", " + this.dob + ", " + this.email + ", " + this.cellulare + ", " + this.gender;
	}
}