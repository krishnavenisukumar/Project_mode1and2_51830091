 package com.bankapp.web.controller;

public class AccountUpdateBean {

	private Double balance;
	private boolean blocked;
	private String email;
	private String phone;
	private String address;
	private String city;
	private String country;

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public AccountUpdateBean(Double balance, boolean blocked, String email, String phone, String address, String city,
			String country) {
		super();
		this.balance = balance;
		this.blocked = blocked;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public AccountUpdateBean() {

	}

}
