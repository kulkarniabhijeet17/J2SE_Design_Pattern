package com.abhijeet.behavioral.command2;

public class SaveSublimeText implements Command {
	private SublimeText sublimeText;

	public SaveSublimeText(SublimeText sublimeText) {
		this.sublimeText = sublimeText;
	}

	@Override
	public void execute() {
		sublimeText.save();
	}
}