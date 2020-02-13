package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Customer;
import com.example.interfaces.ICustomerRepository;
import com.example.interfaces.ICustomerService;

@Service
public class CustomerServiceImp implements ICustomerService{
	@Autowired
	private ICustomerRepository repository;
	
	@Override
	public List<Customer> listar() {
		return repository.findAll();
	}

	@Override
	public Customer listarId(String id) {
		return repository.findById(id);
	}
}
