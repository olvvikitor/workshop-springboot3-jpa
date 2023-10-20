package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.reposities.OrderRepositoy;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepositoy repository;
	
	public List<Order>findAllOrders(){
		return repository.findAll();
	}
	
	public Order findByIdOrder(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
