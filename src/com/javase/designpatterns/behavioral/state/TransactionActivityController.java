package com.abhijeet.behavioral.state;

public class TransactionActivityController implements TransactionActivity {
	private TransactionActivity transactionActivity;

	public void completedTransactions() {
		transactionActivity.completedTransactions();
	}

	public void pendingTransactions() {
		transactionActivity.pendingTransactions();
	}

	public void deniedTransactions() {
		transactionActivity.deniedTransactions();
	}

	public TransactionActivity getTransactionActivity() {
		return transactionActivity;
	}

	public void setTransactionActivity(TransactionActivity transactionActivity) {
		this.transactionActivity = transactionActivity;
	}
}