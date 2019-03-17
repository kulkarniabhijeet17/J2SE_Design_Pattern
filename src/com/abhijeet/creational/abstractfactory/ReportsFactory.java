package com.abhijeet.creational.abstractfactory;

public class ReportsFactory {
	public static Reports getReports(ReportsAbstractFactory factory) {
		return factory.createReports();
	}
}