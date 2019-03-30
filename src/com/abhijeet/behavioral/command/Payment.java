package com.abhijeet.behavioral.command;

// Invoker
public class Payment {
	public void addOrder(final Transaction transaction) {
		transaction.perform();
	}
}