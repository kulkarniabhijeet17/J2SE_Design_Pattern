package com.abhijeet.creational.factory;

public class ReportsFactory {
	public Reports getReports(String type) {
		if ("pdf".equalsIgnoreCase(type)) {
			return new PdfReport();
		} else {
			return new CsvReport();
		}
	}
}