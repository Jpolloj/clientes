package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Customer;
import com.example.interfaces.ICustomerService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/customer"})
public class listCustomerController {
	@Autowired
	ICustomerService service;

	@GetMapping
	public List<Customer>listar(){ 
		return service.listar();
	}
	
	@GetMapping(path = {"/{id}"})
	public Customer listarId(@PathVariable String id){
		return service.listarId(id);
	}
}



