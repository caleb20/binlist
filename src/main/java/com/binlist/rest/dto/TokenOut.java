package com.binlist.rest.dto;

import java.util.Date;

public class TokenOut {

	private String token;
	private String brand;
	private Date creation_dt;

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

	public Date getCreation_dt() {
		return creation_dt;
	}

	public void setCreation_dt(Date creation_dt) {
		this.creation_dt = creation_dt;
	}

	@Override
	public String toString() {
		return "TokenOut [token=" + token + ", brand=" + brand + ", creation_dt=" + creation_dt + "]";
	}

}
