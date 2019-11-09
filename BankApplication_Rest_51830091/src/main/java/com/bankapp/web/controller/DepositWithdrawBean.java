package com.bankapp.web.controller;

public class DepositWithdrawBean {
	private Long accountNumber;
	private double amount;

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public DepositWithdrawBean() {

	}

	public DepositWithdrawBean(Long accountNumber, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

}
