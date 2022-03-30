package com.abhijeet.structural.adapter;

// Target
public class StandardAccount extends AccountImpl {
	public StandardAccount(final double balance) {
		super(balance);
		setOverdraftAvailable(false);
	}
}