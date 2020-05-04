package com.example.weddingplanner.pojo;

public class VendorItem {

    private int vendorImage;

    public int getVendorId() {
        return vendorId;
    }

    private int vendorId;

    public VendorItem(int vendorId,int vendorImage, String vendorName) {
        this.vendorId = vendorId;
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
