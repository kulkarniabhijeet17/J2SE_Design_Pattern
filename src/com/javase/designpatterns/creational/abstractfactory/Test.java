package com.javase.designpatterns.creational.abstractfactory;

public class Test {
	public static void main(String[] args) {
		Reports pdf = ReportsFactory.getReports(new PdfReportsFactory());
		Reports csv = ReportsFactory.getReports(new CsvReportsFactory());
	}
}