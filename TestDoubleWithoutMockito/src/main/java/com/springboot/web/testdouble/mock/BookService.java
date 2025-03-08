package com.springboot.web.testdouble.mock;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;



public class BookService {
	@Autowired
	private BookRepository bRepo;
	public void addBook(Book book)
	{if(book.getPrice()>400)
		return;
		this.bRepo.saveBook(book);
		
	}

	public BookService(BookRepository bRepo)
	{
		this.bRepo=bRepo;
	}

}
