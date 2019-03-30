package com.abhijeet.behavioral.command;

public class Refund implements Transaction {
	private final PaymentType paymentType;

	public Refund(final PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public void perform() {
		paymentType.refund();
	}
}