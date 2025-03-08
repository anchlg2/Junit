package com.springboot.web.testdouble.fake;

import java.util.Collection;

public interface BookRepository {
public void saveBook(Book book);
public Collection<Book> findAllBooks();
}
