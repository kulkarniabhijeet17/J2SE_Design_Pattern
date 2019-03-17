package com.abhijeet.behavioral.strategy;

public class PayTMStrategy implements PaymentStrategy {
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with paytm");
	}
}