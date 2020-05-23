package com.example.weddingplanner.pojo;

public class RealWeddingItem {

    public RealWeddingItem(int id,int realWeddingImage, String title, String description) {
        this.id = id;
        this.realWeddingImage = realWeddingImage;
        this.title = title;
        this.description = description;
    }

    public int getRealWeddingImage() {
        return realWeddingImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    private int realWeddingImage;
    private String title;
    private String description;

    public int getId() {
        return id;
    }

    private int id;
}
