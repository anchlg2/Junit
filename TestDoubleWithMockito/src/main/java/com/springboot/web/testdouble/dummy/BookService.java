package com.springboot.web.testdouble.dummy;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService {
	@Autowired
	private BookRepository bRepo;
	@Autowired
	private EmailService emailService;
	public void addBook(Book book)
	{this.bRepo.saveBook(book);
		
	}
	public int findNumberOfBooks()
	{
		return this.bRepo.findAllBooks().size();
	}
	public BookService(BookRepository bRepo , EmailService emailService)
	{
		this.bRepo=bRepo;
		this.emailService=emailService;
	}

}
