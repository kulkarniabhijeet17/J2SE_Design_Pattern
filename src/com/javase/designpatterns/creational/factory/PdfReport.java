package com.javase.designpatterns.creational.factory;

public class PdfReport extends Reports {
	@Override
	public ReportsDto getUserDetails() {
		ReportsDto reportsDto = new ReportsDto();
		return reportsDto;
	}
}