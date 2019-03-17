package com.abhijeet.behavioral.strategy;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args) {
		Discount easterDiscount = new EasterDiscount();

		BigDecimal discountedValue = easterDiscount.applyDiscount(BigDecimal.valueOf(100));
	}
}