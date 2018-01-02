package com.zeno.bean;

public class User {

    private String name;

    public User() {
        System.out.println("Class construct");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Set object property");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
