package com.springboot.web.testdouble.dummy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.springboot.web.testdouble.dummy.Book;
import com.springboot.web.testdouble.dummy.BookRepository;
import com.springboot.web.testdouble.dummy.BookService;
import com.springboot.web.testdouble.dummy.EmailService;




class BookServiceTest {

	@Test
	void testBookService() {
		BookRepository fakeBookRepository=new FakeBookRepository();
		EmailService dummyEmailService=new DummyEmailService();
		BookService bookService=new BookService(fakeBookRepository , dummyEmailService);
		bookService.addBook(new Book("123","Java",200));
		bookService.addBook(new Book("234","Python",400));
		bookService.addBook(new Book("456","Spring",300));
		bookService.addBook(new Book("789","Cpp",500));
		assertEquals(4, bookService.findNumberOfBooks());
	}

	
}
