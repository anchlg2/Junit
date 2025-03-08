package com.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.Person;
import com.springboot.web.repo.PersonRepository;
@Service
public class PersonService {
	@Autowired
	private PersonRepository prepo;
	public List<Person> getAllPersons()
	{
		return this.prepo.findAll();
	}
	public PersonService(PersonRepository pRepo)
	{
		this.prepo=pRepo;
	}
}
