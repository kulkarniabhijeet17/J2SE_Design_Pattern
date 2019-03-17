package com.abhijeet.creational.abstractfactory;

public class CsvReportsFactory implements ReportsAbstractFactory {
	@Override
	public Reports createReports() {
		return new CsvReport();
	}
}