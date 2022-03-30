package com.abhijeet.behavioral.command;

// Receiver
public class PaymentTypeImpl implements PaymentType {
	@Override
	public void sale() {
		System.out.println("Sale Payment");
	}

	@Override
	public void refund() {
		System.out.println("Refund Payment");
	}
}