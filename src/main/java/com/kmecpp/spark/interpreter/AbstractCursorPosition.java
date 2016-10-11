package com.kmecpp.spark.interpreter;

public abstract class AbstractCursorPosition {

	protected int position;

	public int getPosition() {
		return position;
	}

	public boolean moveNext() {
		position++;
		return hasIndex(position + 1);
	}

	public boolean movePrev() {
		position--;
		return hasIndex(position - 1);
	}

	public boolean hasNext() {
		return hasIndex(position + 1);
	}

	public boolean eof() {
		return hasIndex(position);
	}

	public abstract boolean hasIndex(int index);

}
