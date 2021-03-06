package com.binlist.rest.dto;

import com.binlist.rest.dto.card.Bank;
import com.binlist.rest.dto.card.Country;
import com.binlist.rest.dto.card.NumberCard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BinlistOut {

	
	private NumberCard number;
	@JsonIgnore
	private String scheme;
	@JsonIgnore
	private String type;
	@JsonIgnore
	private String brand;
	@JsonIgnore
	private boolean prepaid;
	private Country country;
	private Bank bank;

	public NumberCard getNumber() {
		return number;
	}

	public void setNumber(NumberCard number) {
		this.number = number;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isPrepaid() {
		return prepaid;
	}

	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "BinlistOut [number=" + number + ", scheme=" + scheme + ", type=" + type + ", brand=" + brand
				+ ", prepaid=" + prepaid + ", country=" + country + ", bank=" + bank + "]";
	}

}
