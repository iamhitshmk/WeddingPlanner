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
        listOfItems.add(new MoreMenuItem(1,R.drawable.ic_more_profile,"Profile"));
        listOfItems.add(new MoreMenuItem(2,R.drawable.ic_more_inbox,"Inbox"));
        listOfItems.add(new MoreMenuItem(3,R.drawable.ic_more_wedding_join,"Join A Wedding"));
        listOfItems.add(new MoreMenuItem(4,R.drawable.ic_more_create_wedding,"Create Your Wedding"));
        listOfItems.add(new MoreMenuItem(5,R.drawable.ic_more_review,"Write a Review"));
        listOfItems.add(new MoreMenuItem(6,R.drawable.ic_more_about,"About"));


        moreMenuList.setValue(listOfItems);
    }

    public LiveData<ArrayList<MoreMenuItem>> getMoreMenuList() {
        return moreMenuList;
    }

}
