package com.springboot.web.testdouble.stub;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



public class BookService {
	@Autowired
	private BookRepository bRepo;
	public List<Book> getNewBooksWithAppliedDiscount(int discountRate , int days)
	{
		List<Book> newBooks=bRepo.findNewBooks( days);
		for(Book b:newBooks)
		{
			int price=b.getPrice();
			int newPrice= price - (discountRate/100 * price);
			b.setPrice(newPrice);
		}
		return newBooks;
				
	}
	public BookService(BookRepository bRepo)
	{
		this.bRepo=bRepo;
	}

}
