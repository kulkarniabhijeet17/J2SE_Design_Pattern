package com.javase.designpatterns.creational.factory;

public class Test {
	public static void main(String[] args) {
		ReportsFactory reportsFactory = new ReportsFactory();
		Reports pdf = reportsFactory.getReports("pdf");
		Reports csv = reportsFactory.getReports("csv");
	}
}