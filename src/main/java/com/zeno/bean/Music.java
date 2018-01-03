package com.zeno.bean;

public class Music {

    private String name;
    private String song;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", song='" + song + '\'' +
                '}';
    }
}
