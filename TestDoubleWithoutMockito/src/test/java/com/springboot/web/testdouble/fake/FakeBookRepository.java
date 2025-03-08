package com.springboot.web.testdouble.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {
//in memory dstabase hashmap or list
	Map<String, Book> bookStore = new HashMap<>();
	@Override
	public void saveBook(Book book) {
		
		bookStore.put(book.getBookId(),book);
	}

	@Override
	public Collection<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return bookStore.values();
	}

}
