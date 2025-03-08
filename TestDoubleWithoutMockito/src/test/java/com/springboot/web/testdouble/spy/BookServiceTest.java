package com.springboot.web.testdouble.spy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




class BookServiceTest {

	@Test
	void testBookService() {
		SpyBookRepository spyBookRepository=new SpyBookRepository();
	BookService bookService=new BookService(spyBookRepository);
	bookService.addBook(new Book("123","Java",200));
	bookService.addBook(new Book("234","Python",400));
	bookService.addBook(new Book("456","Spring",300));
	Book lastBook=new Book("789","Cpp",500);
			bookService.addBook(lastBook);
	assertEquals(4, spyBookRepository.numberOfBooks()); //behaviour verification here in test class in spy testdouble
	//assertTrue(spyBookRepository.lastBook(lastBook)); //fail because lastbookprice>400 , and we have added books with price<=400
	}

}