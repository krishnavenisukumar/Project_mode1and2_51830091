package com.bankapp.web.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.CustomerService;
import com.bankapp.model.service.exceptions.AccountNotFoundException;

@RestController
@RequestMapping(path="/api/account/")

public class AccountRestController {
	
	@Autowired
	private AccountService accountService;

	private CustomerService customerService;

	@Autowired
	public AccountRestController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	

	/*@GetMapping(path = "account", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Account>> getAllProduct()
	{
		return new ResponseEntity<List<Account>>(accountService.getAllAccount(),HttpStatus.OK);
	}*/
	
	@GetMapping(path = "customer", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(), HttpStatus.OK);
	}

	@GetMapping(path = "customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getAnProduct(@PathVariable(name = "id") Long id) {
		Customer customer = customerService.findCustomerById(id).orElseThrow(AccountNotFoundException::new);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@DeleteMapping(path = "customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteProduct(@PathVariable(name = "id") Long id) {
		customerService.deleteCustomer(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@PutMapping(path = "customer/{accountNumber}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> updateAccount(@PathVariable(name = "accountNumber") Long accountNumber,
			@RequestBody AccountUpdateBean accountUpdate) {

		Customer customer = accountService.getCustomerById(accountNumber);
		customer.setEmail(accountUpdate.getEmail());
		customer.setPhone(accountUpdate.getPhone());
		customer.setAddress(accountUpdate.getAddress());
		customer.setCity(accountUpdate.getCity());
		customer.setCountry(accountUpdate.getCountry());

		Account account = accountService.getAccountById(accountNumber);
		account.setBalance(accountUpdate.getBalance());
		account.setBlocked(accountUpdate.isBlocked());
		customer.setAccount(account);
		account.setCustomer(customer);

		return new ResponseEntity<Account>(accountService.createAccount(account), HttpStatus.OK);
	}

	@PostMapping(path = "customer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> addAcc(@RequestBody FormBean formBean) {
		Customer customer = new Customer(formBean.getName(), formBean.getEmail(), formBean.getPhone(),
				formBean.getAddress(), formBean.getCity(), formBean.getCountry());
		Account account = new Account(formBean.getBalance(), customer, formBean.isBlocked());
		customer.setAccount(account);
		return new ResponseEntity<Account>(accountService.addAccount(account), HttpStatus.CREATED);
	}

}
