package com.springboot.web.testdouble.spy;

public class SpyBookRepository implements BookRepository {
int count=0;
Book lastBook=null;
	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		
		count++;
		lastBook=book;
	}
	public int numberOfBooks()
	{
		return count;
	}
	public boolean lastBook(Book book)
	{
		return lastBook.equals(book);
	}

}
