package com.zeno.bean;

import java.util.List;
import java.util.Map;

public class User {

    private String name;
    private List<Book> books;
    private Map<String,String> address;

    public User() {
        System.out.println("Class construct");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Set object property");
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", books=" + books +
                ", address=" + address +
                '}';
    }
}
