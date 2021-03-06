package com.example.weddingplanner.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "PlaceOrder")
public class PlaceOrderItem implements Parcelable {

    protected PlaceOrderItem(Parcel in) {
        id = in.readInt();
        image = in.readInt();
        name = in.readString();
        rating = in.readString();
        reviews = in.readString();
        location = in.readString();
        price = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(image);
        dest.writeString(name);
        dest.writeString(rating);
        dest.writeString(reviews);
        dest.writeString(location);
        dest.writeString(price);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PlaceOrderItem> CREATOR = new Creator<PlaceOrderItem>() {
        @Override
        public PlaceOrderItem createFromParcel(Parcel in) {
            return new PlaceOrderItem(in);
        }

        @Override
        public PlaceOrderItem[] newArray(int size) {
            return new PlaceOrderItem[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

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


    @ColumnInfo(name = "image")
    private int image;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "rating")
    private String rating;

    @ColumnInfo(name = "reviews")
    private String reviews;

    @ColumnInfo(name = "location")
    private String location;

    @ColumnInfo(name = "price")
    private String price;

    @Ignore
    public PlaceOrderItem(int image, String name, String rating, String reviews, String location, String price) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.reviews = reviews;
        this.location = location;
        this.price = price;
    }

    public PlaceOrderItem(int id ,int image, String name, String rating, String reviews, String location, String price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.reviews = reviews;
        this.location = location;
        this.price = price;
    }

    public PlaceOrderItem() {
    }
}
