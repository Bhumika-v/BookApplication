package com.book.dao.test;

import static org.junit.Assert.*;
import java.sql.Connection;
import org.junit.Test;

import com.book.dao.BookDAO;
import com.book.domain.Book;

public class BookDAOTest {

	@Test
	public void testOpenConnection() {
		System.out.println("openConnection");
		Connection result = BookDAO.getConnection();
		assertEquals(result != null, true);
	}

	@Test
	public void testCreateBook() throws Exception {
		BookDAO dao = new BookDAO();
		Book book = new Book();
		int check = dao.createBook(book);
		assertEquals(check, 1);
	}

	@Test
	public void testReadBook() throws Exception {
		BookDAO dao = new BookDAO();
		Book book = new Book();
		boolean check = dao.readBook(book);
		assertEquals(check, true);
	}

	@Test
	public void testUpdateBook() throws Exception {
		BookDAO dao = new BookDAO();
		Book book = new Book(1,6);
		int check = dao.updateBook(book);
		assertEquals(check,0);

	}

	@Test
	public void testDeleteBook() throws Exception {
		BookDAO dao = new BookDAO();
		Book book = new Book(1);
		int check = dao.deleteBook(book);
		assertEquals(check, 0);
	}

}
