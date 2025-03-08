package com.springboot.web.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.web.repo.PersonRepository;
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {
	@Mock
private PersonRepository pRepo;
	@InjectMocks //here this is replacemnt of below written setUp method 
	//@Autowired // we will not use autowire ,because if we use autowire , the original personrepo will be use and we have to use mock repo
	private PersonService personService;
//	@BeforeEach
//public void setUp()
//{this.personService=new PersonService(pRepo);
//	
//}
	@Test
	void testGetAllPersons() {
	personService.getAllPersons();
	verify(pRepo).findAll();
	}

}
