package com.springboot.web.testdouble.fake;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.web.testdouble.dummy.EmailService;

public class BookService {
	@Autowired
	private BookRepository bRepo;
	public void addBook(Book book)
	{this.bRepo.saveBook(book);
		
	}
	public int findNumberOfBooks()
	{
		return this.bRepo.findAllBooks().size();
	}
	public BookService(BookRepository bRepo)
	{
		this.bRepo=bRepo;
	}

}
