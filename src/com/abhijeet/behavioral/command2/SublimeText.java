package com.abhijeet.behavioral.command2;

// Receiver
public class SublimeText {
	public void open() {
		System.out.println("Sublime Text is Opened");
	}

	public void edit() {
		System.out.println("Sublime Text is Edited");
	}

	public void save() {
		System.out.println("Sublime Text is Saved");
	}

	public void close() {
		System.out.println("Sublime Text is Closed");
	}
}