package com.springboot.web.testdouble.stub;

import java.util.Collection;
import java.util.List;

public interface BookRepository {


public List<Book> findNewBooks(int days);
}
