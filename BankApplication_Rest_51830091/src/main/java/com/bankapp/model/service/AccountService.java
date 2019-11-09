package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;

public interface AccountService {
	
	public List<Account> getAllAccounts();

	public Account addAccount(Account account);

	void blockAccount(Long accountNumber);

	Account createAccount(Account account);

	void deposit(Long accountNumber, double amount);

	void withdraw(Long accountNumber, double amount);

	void transfer(Long fromAccNumber, Long toAccNumber, double amount);

	Customer getCustomerById(Long accountNumber);

	Account getAccountById(Long accountNumber);

}
