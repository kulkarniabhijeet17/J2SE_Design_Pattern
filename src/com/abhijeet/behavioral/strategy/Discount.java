package com.abhijeet.behavioral.strategy;

import java.math.BigDecimal;

public interface Discount {
	BigDecimal applyDiscount(BigDecimal amount);
}