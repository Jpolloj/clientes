package com.example.interfaces;

import org.springframework.data.repository.Repository;

import com.example.dto.Customer;

import java.util.List;


public interface ICustomerRepository extends Repository<Customer, Integer> {
	List<Customer>findAll();
	Customer findById(String id);
}
