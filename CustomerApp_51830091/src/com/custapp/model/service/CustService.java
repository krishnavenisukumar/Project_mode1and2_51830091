package com.custapp.model.service;

import java.util.List;

import com.custapp.model.persistence.Customer;

public interface CustService {
	public List<Customer> getAllCustomers();
	public Customer getCustomerById(int custId);
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(int custId);
}
