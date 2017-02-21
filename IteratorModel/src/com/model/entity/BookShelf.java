package com.model.entity;

import java.util.ArrayList;
import java.util.List;
import com.model.interfaces.Aggregate;
import com.model.interfaces.Iterator;

/**
 * 书架实体类
 * @author Tom
 */
public class BookShelf implements Aggregate{
	private List<Book> books=new ArrayList<Book>();
	private int last = 0;

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public int getLength() {
		return last;
	}

	public void appendBook(Book book){
		this.books.add(book);
		last++;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
