package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.entity.Person;
import com.springboot.web.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService pService;
	@RequestMapping("/persons")
	public List<Person> getPersons()
	{
		return this.pService.getAllPersons();
	}

}
