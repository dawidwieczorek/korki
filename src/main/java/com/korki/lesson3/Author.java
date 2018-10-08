package com.korki.lesson3;


import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private List<Book> books = new ArrayList<Book>();
    private Country country;

    public Author(String name, List<Book> books, Country country) {
        this.name = name;
        this.books = books;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Country getCountry() {
        return country;
    }
}
