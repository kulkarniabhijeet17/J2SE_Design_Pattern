package com.javase.designpatterns.creational.abstractfactory;

public class PdfReport extends Reports {
	@Override
	public ReportsDto getUserDetails() {
		ReportsDto reportsDto = new ReportsDto();
		return reportsDto;
	}
}