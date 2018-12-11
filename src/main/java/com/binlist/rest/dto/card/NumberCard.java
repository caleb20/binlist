package com.binlist.rest.dto.card;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NumberCard {
	
	@JsonIgnore
	private int length;
	@JsonIgnore
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
