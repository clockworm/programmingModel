package com.model.entity;

import com.model.interfaces.Iterator;

/**
 * 书架迭代器
 * @author Tom
 */
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hashNext() {
		if (index < bookShelf.getLength()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
