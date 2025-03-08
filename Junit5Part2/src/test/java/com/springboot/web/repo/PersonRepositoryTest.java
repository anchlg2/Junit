package com.springboot.web.repo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.web.entity.Person;
@SpringBootTest
class PersonRepositoryTest {
	@Autowired
private PersonRepository pRepo;
	@Test
	void testExistsByPersonId() {
		Person person=new Person("123","Anchal","Goa");
		this.pRepo.save(person);
		Boolean actuaResult=this.pRepo.existsByPersonId("123");
		assertThat(actuaResult).isTrue();
	}
	@AfterEach
	public void tearDown()
	{
		System.out.println("Tearing down");
		this.pRepo.deleteAll();
	}
	@BeforeEach
	public void setUp()
	{
		System.out.println("Setting up");
		
	}

}
