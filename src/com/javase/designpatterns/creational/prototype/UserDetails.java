package com.javase.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class UserDetails implements Cloneable {
	private List<String> userList;

	public UserDetails() {
		this.userList = new ArrayList<>();
	}

	public UserDetails(List<String> users) {
		this.userList = users;
	}

	public void getUsers() {
		userList.add("Amar");
		userList.add("Akbar");
		userList.add("Anthony");
		userList.add("Don");
	}

	public List<String> getUsersList() {
		return userList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>();
		for (String s : this.getUsersList()) {
			temp.add(s);
		}
		return new UserDetails((List<String>) temp);
	}
}