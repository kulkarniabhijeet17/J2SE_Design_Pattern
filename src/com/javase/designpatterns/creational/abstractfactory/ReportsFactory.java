package com.javase.designpatterns.creational.abstractfactory;

public class ReportsFactory {
	public static Reports getReports(ReportsAbstractFactory factory) {
		return factory.createReports();
	}
}