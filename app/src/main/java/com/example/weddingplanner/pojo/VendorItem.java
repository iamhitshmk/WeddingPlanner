package com.example.weddingplanner.pojo;

public class VendorItem {

    private int vendorImage;

    public VendorItem(int vendorImage, String vendorName) {
        this.vendorImage = vendorImage;
        this.vendorName = vendorName;
    }

    public int getVendorImage() {
        return vendorImage;
    }

    public String getVendorName() {
        return vendorName;
    }

    private String vendorName;

}
