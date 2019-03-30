package com.abhijeet.behavioral.command2;

public class OpenSublimeText implements Command {
	private SublimeText sublimeText;

	public OpenSublimeText(SublimeText sublimeText) {
		this.sublimeText = sublimeText;
	}

	@Override
	public void execute() {
		sublimeText.open();
	}
}