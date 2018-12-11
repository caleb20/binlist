package com.binlist.rest.dto;

public class TokenOut {

	private String token;
	private String brand;
	private String creation_dt;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCreation_dt() {
		return creation_dt;
	}

	public void setCreation_dt(String formatDateTime) {
		this.creation_dt = formatDateTime;
	}

	@Override
	public String toString() {
		return "TokenOut [token=" + token + ", brand=" + brand + ", creation_dt=" + creation_dt + "]";
	}

}
