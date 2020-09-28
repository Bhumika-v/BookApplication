ISBNBookApplication 

Performing basic CRUD operations using JDBC connectivity as a console output.

Steps need to be followed to configure this project
1. Import project in your workspace.
2. Create your DB Schema and use the schema.
3. Drop the table and create the table of ISBNBookApplication.
4. Business of this application is, it will allow user to perform the create, delete, update and read operations by providing the selected options based on his/her needs.
5. Make sure there shouldn't be any compilation error before you run an application.

Table for Book is created in the sql with the attributes ISBNNUMBER,BOOKNAME,AUTHORNAME,EDITION.
Three main classes for JDBC is created to the Project:
1. Book.java - where this class contains the getter and setter methods for all the attributes
2. BookController.java - it is the main class of the project where all the classes and its methods
						is called in this class and the actual program execution starts from this class.
3. BookDAO.java - This class contains all the CRUD operations of the project such as database connection,
					sql query and its implementation.
5 methods is used in BookDao class:
1. Connection() method for database connection(mysql and jdbc connection)
2. createBook() is used to insert the book details in to the Book table where Isbn Number is auto generated.
3. readBook() is used to fetch the book details from the table using Isbn Number.
4. updateBook() is used to update the edition using Isbn Number.
5. deleteBook() is used to delete the book details using Isbn Number from the table.
Junit test cases is done to all the 5 methods.
1. Connection()
2. testCreateBook()
3. testReadBook()
4. testUpdateBook()
5. testDeleteBook()