package com.abhijeet.behavioral.command;

// Client
public class Test {
	public static void main(String[] args) {
		// Transaction transaction = new Sale(new PaymentTypeImpl());
		Transaction transaction = new Refund(new PaymentTypeImpl());
		Payment payment = new Payment();
		payment.addOrder(transaction);
	}
}