package com.abhijeet.behavioral.iterator;

public interface Container<E> {
	public CustomIterator<E> getIterator();
}