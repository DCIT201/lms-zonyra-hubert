package org.example;

public class Book {
    private String title;         // Title of the book
    private String author;        // Author of the book
    private int yearPublished;    // Year the book was published

    // Constructor to initialize the attributes
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for yearPublished
    public int getYearPublished() {
        return yearPublished;
    }
}
