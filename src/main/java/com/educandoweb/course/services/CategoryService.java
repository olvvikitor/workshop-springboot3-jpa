package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.reposities.CategoryRepository;


@Service
public class CategoryService {
	
	private CategoryRepository repository;
	
	public List<Category>findAllCategorys(){
		return repository.findAll();
	}
	
	public Category findByIdCategory(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
