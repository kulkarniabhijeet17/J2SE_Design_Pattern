package com.abhijeet.structural.adapter;

// Client
public class Test {
	public static void main(String[] args) {
		StandardAccount sa = new StandardAccount(2000);
		System.out.println("Account Balance= " + sa.getBalance());

		// Calling getBalance() on Adapter
		AccountAdapter adapter = new AccountAdapter(new OffshoreAccount(2000));
		System.out.println("Account Balance= " + adapter.getBalance());
	}
}