package com.javase.designpatterns.creational.builder.approach1;

public class User {
	private final String userId; // required
	private final String password; // required
	private final String firstName; // required
	private final String lastName; // required
	private final String middleInitial; // optional
	private final String dob; // optional
	private final String email; // required
	private final String cellulare; // optional
	private final String gender; // optional

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.password = builder.password;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.middleInitial = builder.middleInitial;
		this.dob = builder.dob;
		this.email = builder.email;
		this.cellulare = builder.cellulare;
		this.gender = builder.gender;
	}

	public static class UserBuilder {
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
			User user = new User(this);
			return user;
		}
	}

	@Override
	public String toString() {
		return "User: " + this.userId + ", " + this.password + ", " + this.firstName + ", " + this.lastName + ", "
				+ this.middleInitial + ", " + this.dob + ", " + this.email + ", " + this.cellulare + ", " + this.gender;
	}

	// All getters and No setters to provide immutability
	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public String getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	public String getCellulare() {
		return cellulare;
	}

	public String getGender() {
		return gender;
	}
}