package com.abhijeet.behavioral.state;

public class CCTATransactionActivity implements TransactionActivity {
	@Override
	public void completedTransactions() {
		System.out.println("CCTATransactionActivity: completedTransactions");
	}

	@Override
	public void pendingTransactions() {
		System.out.println("CCTATransactionActivity: pendingTransactions");
	}

	@Override
	public void deniedTransactions() {
		System.out.println("CCTATransactionActivity: deniedTransactions");
	}
}