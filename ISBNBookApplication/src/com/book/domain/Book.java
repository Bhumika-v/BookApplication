package com.book.domain;

public class Book {
	private int isbnNumber;
	private String bookName;
	private String authorName;
	private int edition;

	public Book(int isbnNumber, String bookName, String authorName, int edition) {
		super();
		this.isbnNumber = isbnNumber;
		this.bookName = bookName;
		this.authorName = authorName;
		this.edition = edition;
	}

	public int getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(int isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public Book() {

	}

	public Book(int i) {

	}

	public Book(int i, int j) {

	}

}
