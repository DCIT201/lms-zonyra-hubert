package 
package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books; // List to store Book objects

    // Constructor: Initializes the library with an empty list of books
    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Search for a book by title
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Return the book if found
            }
        }
        return null; // Return null if not found
    }
}
