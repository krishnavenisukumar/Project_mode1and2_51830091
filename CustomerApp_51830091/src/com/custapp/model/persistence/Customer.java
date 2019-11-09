package com.custapp.model.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="cust_13")
public class Customer {
	@Id
	@GeneratedValue
	private int cust_id;
	@NotEmpty(message = "name can not be left blank")
	public String name;
	@NotEmpty(message = "address can not be left blank")
	public String address;
	@NotEmpty(message = "email can not be left blank")
	public String email;
	@NotNull(message = "phone_no can not be null")
	public Integer phone_no;
	@NotNull(message = "salary can not be null")
	@Min(value = 10, message = "min value should be more than 10")
	@Max(value = 10000, message = "max value should be less than 10000")
	public Double salary;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Integer phone_no) {
		this.phone_no = phone_no;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Customer(String name, String address, String email, Integer phone_no, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone_no = phone_no;
		this.salary = salary;
	}

	public Customer() {
		super();
	}

}
