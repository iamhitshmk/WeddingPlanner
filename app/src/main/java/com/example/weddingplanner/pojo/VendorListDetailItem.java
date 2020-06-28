package com.example.weddingplanner.pojo;

import java.io.Serializable;

public class VendorListDetailItem implements Serializable {

    public VendorListDetailItem(int image, String name, String rating, String reviews, String location, String price,String description) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.reviews = reviews;
        this.location = location;
        this.price = price;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public String getReviews() {
        return reviews;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }

    private int image;
    private String name;
    private String rating;
    private String reviews;
    private String location;
    private String price;

    public String getDescription() {
        return description;
    }

    private String description;
}
