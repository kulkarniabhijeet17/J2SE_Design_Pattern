package com.abhijeet.creational.abstractfactory;

public class ReportsAction {
	public static void main(String[] args) {
		Reports pdf = ReportsFactory.getReports(new PdfReportsFactory());
		Reports csv = ReportsFactory.getReports(new CsvReportsFactory());
	}
}