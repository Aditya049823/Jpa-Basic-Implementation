package com.demojpa.demoproject;

import javax.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @Column(nullable = false,unique = true)
    private String name;

    private int booksNo;

    public Author(){

    }

    public Author(int authorId, String name, int booksNo) {
        this.authorId = authorId;
        this.name = name;
        this.booksNo = booksNo;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooksNo() {
        return booksNo;
    }

    public void setBooksNo(int booksNo) {
        this.booksNo = booksNo;
    }
}
