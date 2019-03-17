package com.abhijeet.creational.abstractfactory;

public class PdfReportsFactory implements ReportsAbstractFactory {
	@Override
	public Reports createReports() {
		return new PdfReport();
	}
}