package com.abhijeet.creational.builder;

public class Test {
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
	}
}