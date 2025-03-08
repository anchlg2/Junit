package com.springboot.web.testdouble.mock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class BookServiceTest {

	@Test
	void testBookService() {
		MockBookRepository mockBookRepository=new MockBookRepository();
		BookService bookService=new BookService(mockBookRepository);
		bookService.addBook(new Book("123","Java",200));
		bookService.addBook(new Book("234","Python",400));
		bookService.addBook(new Book("456","Spring",300));
		Book lastBook=new Book("789","Cpp",500);
		bookService.addBook(lastBook);
		mockBookRepository.behaviourVerification(3,lastBook); 
	}

}
