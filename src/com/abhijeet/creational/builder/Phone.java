package com.abhijeet.creational.builder;

public class Phone {
	private String os;
	private String processor;
	private int ram;
	private int battery;
	private double screenSize;
	private int camera;

	public Phone(String os, String processor, int ram, int battery, double screenSize, int camera) {
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.battery = battery;
		this.screenSize = screenSize;
		this.camera = camera;
	}
}