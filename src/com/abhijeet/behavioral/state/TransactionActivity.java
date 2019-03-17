package com.abhijeet.behavioral.state;

public interface TransactionActivity {
	public void completedTransactions();

	public void pendingTransactions();

	public void deniedTransactions();
}