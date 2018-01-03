package com.zeno.bean;

public class Disc {

    private String name;
    private String song;
    private String publish;

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

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "name='" + name + '\'' +
                ", song='" + song + '\'' +
                ", publish='" + publish + '\'' +
                '}';
    }
}
