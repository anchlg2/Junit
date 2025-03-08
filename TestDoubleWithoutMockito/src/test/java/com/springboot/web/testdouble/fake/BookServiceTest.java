package com.springboot.web.testdouble.fake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookServiceTest {

	@Test
	void testBookService() {
		
		BookRepository fakeBookRepository=new FakeBookRepository();
		BookService bookService=new BookService(fakeBookRepository);
		bookService.addBook(new Book("123","Java",200));
		bookService.addBook(new Book("234","Python",400));
		bookService.addBook(new Book("456","Spring",300));
		bookService.addBook(new Book("789","Cpp",500));
		assertEquals(4, bookService.findNumberOfBooks());
	}

	

}
