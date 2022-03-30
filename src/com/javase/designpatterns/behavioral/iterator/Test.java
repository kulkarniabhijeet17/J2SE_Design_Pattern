package com.abhijeet.behavioral.iterator;

public class Test {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		CustomIterator<?> iter = namesRepository.getIterator();

		while (iter.hasNext()) {
			System.out.println(iter.currentItem());
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
		iter.reset();
	}
}