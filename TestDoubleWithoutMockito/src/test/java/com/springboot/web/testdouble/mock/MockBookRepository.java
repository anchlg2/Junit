package com.springboot.web.testdouble.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockBookRepository implements BookRepository{
int count=0;
Book lastBook=null;
	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		count++;
		lastBook=book;
		
	}
public void behaviourVerification(int countBooks,Book lastAddedBook) //behaviour verification is done here in mock repository in mock testdouble
{
	assertEquals(countBooks, count);
	assertEquals(lastAddedBook, lastBook);
}
}
