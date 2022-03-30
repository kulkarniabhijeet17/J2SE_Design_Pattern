package com.abhijeet.structural.adapter;

// Adapter
public class AccountAdapter extends AccountImpl {
	private OffshoreAccount offshoreAccount;

	public AccountAdapter(final OffshoreAccount offshoreAccount) {
		super(offshoreAccount.getOffshoreBalance());

		this.offshoreAccount = offshoreAccount;
	}

	/**
	 * Calculate offshore account balance after deducting the tax owed for
	 * offshore account
	 */
	@Override
	public double getBalance() {
		final double taxRate = offshoreAccount.getTaxRate();
		final double grossBalance = offshoreAccount.getOffshoreBalance();

		final double taxableBalance = grossBalance * taxRate;
		final double balanceAfterTax = grossBalance - taxableBalance;
		return balanceAfterTax;
	}
}