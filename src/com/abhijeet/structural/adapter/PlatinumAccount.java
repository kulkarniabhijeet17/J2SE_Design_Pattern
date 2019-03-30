package com.abhijeet.structural.adapter;

// Target
public class PlatinumAccount extends AccountImpl {
	public PlatinumAccount(final double balance) {
		super(balance);
		setOverdraftAvailable(true);
	}
}