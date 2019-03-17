package com.abhijeet.creational.factory;

public class ReportsAction {
	public static void main(String[] args) {
		ReportsFactory reportsFactory = new ReportsFactory();
		Reports pdf = reportsFactory.getReports("pdf");
		Reports csv = reportsFactory.getReports("csv");
	}
}