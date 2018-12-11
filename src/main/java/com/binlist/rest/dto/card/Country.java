package com.binlist.rest.dto.card;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

	@JsonIgnore
	private int numeric;
	@JsonIgnore
	private String alpha2;
	@JsonIgnore
	private String name;
	@JsonIgnore
	private String emoji;
	@JsonIgnore
	private String currency;
	@JsonIgnore
	private int latitude;
	@JsonIgnore
	private int longitude;

	public int getNumeric() {
		return numeric;
	}

	public void setNumeric(int numeric) {
		this.numeric = numeric;
	}

	public String getAlpha2() {
		return alpha2;
	}

	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Country [numeric=" + numeric + ", alpha2=" + alpha2 + ", name=" + name + ", emoji=" + emoji
				+ ", currency=" + currency + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

}
