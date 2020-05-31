package com.example.weddingplanner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.pojo.MoreMenuItem;

import java.util.ArrayList;

public class MoreMenuViewModel extends ViewModel {

    private MutableLiveData<ArrayList<MoreMenuItem>> moreMenuList;

    public MoreMenuViewModel() {
        moreMenuList = new MutableLiveData<>();
        ArrayList<MoreMenuItem> listOfItems = new ArrayList<>();
        listOfItems.add(new MoreMenuItem(1,R.drawable.ic_vendor_wedding_cakes,"Create Wedding"));
        listOfItems.add(new MoreMenuItem(1,R.drawable.ic_vendor_wedding_cakes,"Create Wedding"));
        listOfItems.add(new MoreMenuItem(1,R.drawable.ic_vendor_wedding_cakes,"Create Wedding"));
        listOfItems.add(new MoreMenuItem(1,R.drawable.ic_vendor_wedding_cakes,"Create Wedding"));
        moreMenuList.setValue(listOfItems);
    }

    public LiveData<ArrayList<MoreMenuItem>> getMoreMenuList() {
        return moreMenuList;
    }

}
