package com.example.weddingplanner.pojo;

public class VendorListDetailItem {

    public VendorListDetailItem(int image, String name, String rating, String reviews, String location, String price) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.reviews = reviews;
        this.location = location;
        this.price = price;
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
}
