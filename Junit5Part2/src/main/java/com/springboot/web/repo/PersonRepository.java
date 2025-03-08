package com.springboot.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.entity.Person;

public interface PersonRepository extends JpaRepository<Person, String>{
public boolean existsByPersonId(String personId);
}
