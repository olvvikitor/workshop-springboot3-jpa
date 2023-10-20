package com.educandoweb.course.reposities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

public interface OrderRepositoy extends JpaRepository<Order, Long>{
	

}
