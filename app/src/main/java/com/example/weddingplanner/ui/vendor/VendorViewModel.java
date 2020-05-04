package com.example.weddingplanner.ui.vendor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.VendorItem;

import java.util.ArrayList;

public class VendorViewModel extends ViewModel {

    private MutableLiveData<ArrayList<VendorItem>> vendorList;

    public VendorViewModel() {
        vendorList = new MutableLiveData<>();
        ArrayList<VendorItem> listOfItems = new ArrayList<>();
        listOfItems.add(new VendorItem(1,R.drawable.ic_vendor_wedding_cakes,"Wedding Cakes"));
        listOfItems.add(new VendorItem(2,R.drawable.ic_vendor_wedding_cards,"Wedding Cards"));
        listOfItems.add(new VendorItem(3,R.drawable.ic_vendor_wedding_catering,"Wedding Catering"));
        listOfItems.add(new VendorItem(4,R.drawable.ic_vendor_wedding_decorators,"Wedding Decorators"));
        listOfItems.add(new VendorItem(5,R.drawable.ic_vendor_wedding_dj,"Wedding DJ"));
        listOfItems.add(new VendorItem(6,R.drawable.ic_vendor_wedding_mehendi,"Wedding Mehendi"));
        listOfItems.add(new VendorItem(7,R.drawable.ic_vendor_wedding_pandits,"Wedding Pandits"));
        listOfItems.add(new VendorItem(8,R.drawable.ic_vendor_wedding_photographers,"Wedding Photographers"));
        listOfItems.add(new VendorItem(9,R.drawable.ic_vendor_wedding_venues,"Wedding Venues"));
        listOfItems.add(new VendorItem(10,R.drawable.ic_vendor_bridal_makeup,"Wedding Makeup"));
        vendorList.setValue(listOfItems);
    }

    public LiveData<ArrayList<VendorItem>> getVendorList() {
        return vendorList;
    }
}