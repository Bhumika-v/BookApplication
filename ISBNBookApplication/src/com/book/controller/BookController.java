package com.book.controller;

import java.util.Scanner;

import com.book.dao.BookDAO;
import com.book.domain.Book;

public class BookController {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		BookDAO operations = new BookDAO();
		Book book = new Book();

		int status = 0;
		do {
			System.out.println("Select Your Choice");
			System.out.println("1.Create");
			System.out.println("2.Read");
			System.out.println("3.Update ");
			System.out.println("4.Delete ");
			int optedOption = scanner.nextInt();

			switch (optedOption) {

			case 1:
				System.out.println("Insert the Book details");
				System.out.println("Enter the Book name");
				book.setBookName(scanner.next());
				System.out.println("Enter the Author name");
				book.setAuthorName(scanner.next());
				System.out.println("Enter the Edition");
				book.setEdition(scanner.nextInt());

				int result = operations.createBook(book);
				if (result != 0) {
					System.out.println("Book details are inserted \n");
				} else {
					System.out.println("Book details insertion failed \n");
				}
				break;
			case 2:
				System.out.println("Enter the ISBN number \n");
				book.setIsbnNumber(scanner.nextInt());
				operations.readBook(book);
				break;
			case 3:
				System.out.println("Update the Book details");
				System.out.println("Enter the ISBN number of the book to be updated");
				book.setIsbnNumber(scanner.nextInt());
     			System.out.println("Enter the Editionto be updated:\n");
				book.setEdition(scanner.nextInt());
				int result1 = operations.updateBook(book);
				if (result1 != 0) {
					System.out.println("Book details updated \n");
				} else {
					System.out.println("Book details updation failed\n");
				}
				break;
			case 4:
				System.out.println("Enter the ISBN_number to delete book details");
				book.setIsbnNumber(scanner.nextInt());
				int result2 = operations.deleteBook(book);
				if (result2 != 0) {
					System.out.println("Book details deleted successfuly");
				} else {
					System.out.println("Book details deletion failed\n");
				}
			}
			System.out.println("To continue press any number other than 0\n");
			status = scanner.nextInt();
		} while (!(status == 0));

	}

}
