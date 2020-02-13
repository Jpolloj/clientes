package com.example.interfaces;

import java.util.List;

import com.example.dto.Customer;


public interface ICustomerService {
	List<Customer>listar();
	Customer listarId(String id);
}
