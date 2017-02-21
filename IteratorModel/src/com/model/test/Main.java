package com.model.test;

import com.model.entity.Book;
import com.model.entity.BookShelf;
import com.model.interfaces.Iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("《西遊記》"));
		bookShelf.appendBook(new Book("《三國演義》"));
		bookShelf.appendBook(new Book("《紅樓夢》"));
		bookShelf.appendBook(new Book("《中庸》"));
		Iterator iterator = bookShelf.iterator();
		while(iterator.hashNext()){
			Book book = (Book) iterator.next();
			System.err.println(book.getName());
		}
	}
}
