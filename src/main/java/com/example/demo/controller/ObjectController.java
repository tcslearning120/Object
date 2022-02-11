package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Object;
import com.example.demo.service.ObjectService;
@RestController
public class ObjectController {
	@Autowired
	 ObjectService objectService;
	 
		@PostMapping("/object")
		@ResponseStatus(code = HttpStatus.CREATED)
		void creatUser(@RequestBody @Valid Object object) {
			objectService.saveUser(object);
		}

}
