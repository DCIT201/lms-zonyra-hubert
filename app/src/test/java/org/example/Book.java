package org.example;

public class Book {
    private String title;         // The title of the book
    private String author;        // The author of the book
    private int yearPublished;    // The year the book was published

    // Constructor: Initializes the book details
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters to access the private fields
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
