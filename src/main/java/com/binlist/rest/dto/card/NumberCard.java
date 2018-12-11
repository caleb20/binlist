package com.binlist.rest.dto.card;

public class NumberCard {
	
	private int length;
	private boolean luhn;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isLuhn() {
		return luhn;
	}

	public void setLuhn(boolean luhn) {
		this.luhn = luhn;
	}

	@Override
	public String toString() {
		return "NumberCard [length=" + length + ", luhn=" + luhn + "]";
	}

}
