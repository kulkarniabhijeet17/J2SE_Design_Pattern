package com.abhijeet.behavioral.command;

public class Sale implements Transaction {
	private final PaymentType paymentType;

	public Sale(final PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public void perform() {
		paymentType.sale();
	}
}