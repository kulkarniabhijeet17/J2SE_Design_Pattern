package com.abhijeet.behavioral.command2;

// Client
public class Test {
	public static void main(String[] args) {
		SublimeText sublimeText = new SublimeText();
		Command openSublimeText = new OpenSublimeText(sublimeText);
		Command editSublimeText = new EditSublimeText(sublimeText);
		Command saveSublimeText = new SaveSublimeText(sublimeText);
		Command closeSublimeText = new CloseSublimeText(sublimeText);
		Options option = new Options(openSublimeText, editSublimeText, saveSublimeText, closeSublimeText);
		option.pressOpen();
		option.pressEdit();
		option.pressSave();
		option.pressClose();
	}
}