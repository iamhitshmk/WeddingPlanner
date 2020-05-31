package com.example.weddingplanner.pojo;

public class MoreMenuItem {

    public MoreMenuItem(int id, int image, String name) {
        this.id = id;
        this.image = image;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    int id;
    int image;
    String name;

}
