package com.kmecpp.spark.interpreter;

public class TokenStreamReader extends AbstractCursorPosition {

	private Token[] values;

	public TokenStreamReader(Token[] values) {
		this.values = values;
	}

	@Override
	public boolean hasIndex(int index) {
		return index >= 0 && index < values.length;
	}

	public Token readChar() {
		moveNext();
		return last();
	}

	public Token read() {
		if (!hasNext()) {
			return null;
		}
		moveNext();
		return current();
	}

	public Token peek() {
		return cursorIndex(1);
	}

	public Token current() {
		return cursorIndex(0);
	}

	public Token last() {
		return cursorIndex(-1);
	}

	public Token index(int index) {
		return values[index];
	}

	public Token cursorIndex(int offset) {
		return values[position + offset];
	}

	public Token[] range(int start, int end) {
		Token[] range = new Token[end - start];
		System.arraycopy(values, start, range, start, range.length);
		return range;
	}

	public Token[] getValues() {
		return values;
	}

}
