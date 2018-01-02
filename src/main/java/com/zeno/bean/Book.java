package com.zeno.bean;

public class Book {

    private String title;
    private String author;
    private Double price;
    private int reserves;

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, int reserves) {
        this.title = title;
        this.author = author;
        this.reserves = reserves;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", reserves=" + reserves +
                '}';
    }
}
