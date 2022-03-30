package com.abhijeet.structural.adapter;

public class AccountImpl implements Account {
	private double balance;
	private boolean isOverdraftAvailable;

	public AccountImpl(final double size) {
		this.balance = size;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public boolean isOverdraftAvailable() {
		return isOverdraftAvailable;
	}

	@Override
	public void credit(final double credit) {
		balance += credit;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " Balance=" + getBalance() + " Overdraft:" + isOverdraftAvailable();
	}

	public void setOverdraftAvailable(boolean isOverdraftAvailable) {
		this.isOverdraftAvailable = isOverdraftAvailable;
	}
}