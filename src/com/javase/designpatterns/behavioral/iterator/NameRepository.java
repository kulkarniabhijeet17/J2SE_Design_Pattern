package com.abhijeet.behavioral.iterator;

public class NameRepository implements Container<Object> {
	public String names[] = { "Abhijeet", "Snehal", "Anvi", "Kulkarni" };

	@Override
	public CustomIterator<Object> getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements CustomIterator<Object> {
		int index;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}

			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}

			return null;
		}

		@Override
		public void reset() {
			index = 0;
		}

		@Override
		public Object currentItem() {
			return names[index];
		}
	}
}