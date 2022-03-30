package com.abhijeet.behavioral.state;

public class SNAPTransactionActivity implements TransactionActivity {
	@Override
	public void completedTransactions() {
		System.out.println("SNAPTransactionActivity: completedTransactions");
	}

	@Override
	public void pendingTransactions() {
		System.out.println("SNAPTransactionActivity: pendingTransactions");
	}

	@Override
	public void deniedTransactions() {
		System.out.println("SNAPTransactionActivity: deniedTransactions");
	}
}