package com.bankapp.model.service;

import java.util.List;
import java.util.Optional;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomer();

	public Optional<Customer> findCustomerById(Long id);

	public void deleteCustomer(Long id);

	public Customer updateCustomer(Long id, Customer customer);

	public Customer addCustomer(Customer customer);

}
