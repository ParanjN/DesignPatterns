package com.nachiket.designpatterns.builder;

public class Book {
	
	private final String isbn;
	private final String name;
	private final String author;
	
	private Book(BookBuilder builder) {
		this.isbn = builder.isbn;
		this.name = builder.name;
		this.author = builder.author;
		
	}
	
	public static class BookBuilder {
		
		private final String isbn;
		private String name;
		private String author;
		
		public BookBuilder(String isbn) {
			this.isbn = isbn;
		}
		
		public BookBuilder author(String author) {
			this.author = author;
			return this;
		}
		
		
		public Book build() {
			return new Book(this);
		}

	}

}
