package com.demojpa.demoproject;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String bookName;

    @Column(nullable = false)
    private String publisherName;

    @ManyToOne
    @JoinColumn
    Author author;

    public Book(){

    }

    public Book(int bookId, String bookName, String publisherName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publisherName = publisherName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
