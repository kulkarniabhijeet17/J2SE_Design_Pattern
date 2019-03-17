package com.abhijeet.creational.builder;

public class PhoneBuilder {
	private String os;
	private String processor;
	private int ram;
	private int battery;
	private double screenSize;
	private int camera;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder setCamera(int camera) {
		this.camera = camera;
		return this;
	}

	public Phone build() {
		return new Phone(os, processor, battery, ram, screenSize, camera);
	}
}