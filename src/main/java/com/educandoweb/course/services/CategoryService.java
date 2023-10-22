package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.reposities.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;


	
	public List<Category>findAllCategorys(){
		System.out.println("CategoryService está sendo inicializado.");
		return repository.findAll();
		
	}
	
	public Category findByIdCategory(Long id) {
		System.out.println("CategoryService está sendo inicializado.");
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
