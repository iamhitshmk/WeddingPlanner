package com.example.weddingplanner.pojo;

public class PhotosItem {

    public PhotosItem(int photosImage, String title, String description) {
        this.photosImage = photosImage;
        this.title = title;
        this.description = description;
    }

    public int getPhotosImage() {
        return photosImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    private int photosImage;
   private String title;
   private String description;
}
