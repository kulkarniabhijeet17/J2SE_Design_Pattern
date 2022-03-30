package com.abhijeet.behavioral.state;

public class AllTransactionActivity implements TransactionActivity {
	@Override
	public void completedTransactions() {
		System.out.println("AllTransactionActivity: completedTransactions");
	}

	@Override
	public void pendingTransactions() {
		System.out.println("AllTransactionActivity: pendingTransactions");
	}

	@Override
	public void deniedTransactions() {
		System.out.println("AllTransactionActivity: deniedTransactions");
	}
}