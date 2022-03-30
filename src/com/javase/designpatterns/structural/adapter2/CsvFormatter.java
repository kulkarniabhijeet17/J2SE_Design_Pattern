package com.abhijeet.structural.adapter2;

// Adaptee
public class CsvFormatter implements CsvFormattable {
	@Override
	public String formatCsvText(String text) {
		String formattedText = text.replace(".", ",");
		return formattedText;
	}
}