package com.abhijeet.behavioral.state;

public class CashTransactionActivity implements TransactionActivity {
	@Override
	public void completedTransactions() {
		System.out.println("CashTransactionActivity: completedTransactions");
	}

	@Override
	public void pendingTransactions() {
		System.out.println("CashTransactionActivity: pendingTransactions");
	}

	@Override
	public void deniedTransactions() {
		System.out.println("CashTransactionActivity: deniedTransactions");
	}
}