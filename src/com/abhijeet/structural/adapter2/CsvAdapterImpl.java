package com.abhijeet.structural.adapter2;

// Adapter
public class CsvAdapterImpl implements TextFormattable {
	CsvFormattable csvFormatter;

	public CsvAdapterImpl(CsvFormattable csvFormatter) {
		this.csvFormatter = csvFormatter;
	}

	@Override
	public String formatText(String text) {
		String formattedText = csvFormatter.formatCsvText(text);
		return formattedText;
	}
}