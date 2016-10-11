package com.kmecpp.spark.interpreter;

public class CharacterStreamReader extends AbstractCursorPosition {

	private char[] values;

	public CharacterStreamReader(char[] values) {
		this.values = values;
	}

	@Override
	public boolean hasIndex(int index) {
		return index >= 0 && index < values.length;
	}

	public char readChar() {
		moveNext();
		return last();
	}

	public char read() {
		if (!hasNext()) {
			return '\u001A'; //End of file
		}
		moveNext();
		return current();
	}

	public char peek() {
		return cursorIndex(1);
	}

	public char current() {
		return cursorIndex(0);
	}

	public char last() {
		return cursorIndex(-1);
	}

	public char index(int index) {
		return values[index];
	}

	public char cursorIndex(int offset) {
		return values[position + offset];
	}

	public char[] range(int start, int end) {
		char[] range = new char[end - start];
		System.arraycopy(values, start, range, start, range.length);
		return range;
	}

	public char[] getValues() {
		return values;
	}
}
