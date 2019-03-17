package com.abhijeet.behavioral.state;

public class Test {
	public static void main(String args[]) {
		args = new String[] { "ccta" };		// pass input to test

		TransactionActivityController transactionActivityController = new TransactionActivityController();
		if (args[0].equalsIgnoreCase("all")) {
			transactionActivityController.setTransactionActivity(new AllTransactionActivity());
		}
		if (args[0].equalsIgnoreCase("cash")) {
			transactionActivityController.setTransactionActivity(new CashTransactionActivity());
		}
		if (args[0].equalsIgnoreCase("snap")) {
			transactionActivityController.setTransactionActivity(new SNAPTransactionActivity());
		}
		if (args[0].equalsIgnoreCase("ccta")) {
			transactionActivityController.setTransactionActivity(new CCTATransactionActivity());
		}

		transactionActivityController.completedTransactions();
		transactionActivityController.pendingTransactions();
		transactionActivityController.deniedTransactions();
	}
}