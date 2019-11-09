package com.bankapp.web.controller;

public class TransferBean {
	private Long fromAcc;
	private Long toAcc;
	private double amount;

	public Long getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(Long fromAcc) {
		this.fromAcc = fromAcc;
	}

	public Long getToAcc() {
		return toAcc;
	}

	public void setToAcc(Long toAcc) {
		this.toAcc = toAcc;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public TransferBean(Long fromAcc, Long toAcc, double amount) {
		super();
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
		this.amount = amount;
	}

	public TransferBean() {

	}

}
