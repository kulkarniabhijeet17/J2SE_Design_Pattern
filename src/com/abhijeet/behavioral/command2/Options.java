package com.abhijeet.behavioral.command2;

// Invoker
public class Options {
	private Command openSublimeText;
	private Command editSublimeText;
	private Command saveSublimeText;
	private Command closeSublimeText;

	public Options(Command open, Command edit, Command save, Command close) {
		this.openSublimeText = open;
		this.editSublimeText = edit;
		this.saveSublimeText = save;
		this.closeSublimeText = close;
	}

	public void pressOpen() {
		openSublimeText.execute();
	}

	public void pressEdit() {
		editSublimeText.execute();
	}

	public void pressSave() {
		saveSublimeText.execute();
	}

	public void pressClose() {
		closeSublimeText.execute();
	}
}