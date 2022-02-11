package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Object;

import com.example.demo.repository.ObjectRepository;
@Service
public class ObjectService {
	@Autowired 
	ObjectRepository objectRepository;
	
	public void saveUser(Object object) {
		objectRepository.save(object);
	}

	public Iterable<Object> getUsers() {
		return objectRepository.findAll();
	}
	
    public Optional<Object> getuser(Integer id) {
    	return objectRepository.findById(id);
    }
    
    public void deleteUser(Integer id) {
    	objectRepository.deleteById(id);
    }
}
