package com.javase.designpatterns.creational.builder.approach2;

public class UserBuilder {
	private final String userId;
	private final String password;
	private final String firstName;
	private final String lastName;
	private String middleInitial;
	private String dob;
	private final String email;
	private String cellulare;
	private String gender;

	public UserBuilder(String userId, String password, String firstName, String lastName, String email) {
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public UserBuilder middleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
		return this;
	}

	public UserBuilder dob(String dob) {
		this.dob = dob;
		return this;
	}

	public UserBuilder cellulare(String cellulare) {
		this.cellulare = cellulare;
		return this;
	}

	public UserBuilder gender(String gender) {
		this.gender = gender;
		return this;
	}

	// Return the finally constructed User object
	public User build() {
		User user = new User(userId, password, firstName, lastName, middleInitial, dob, email, cellulare, gender);
		return user;
	}
}