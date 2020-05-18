package com.example.weddingplanner.ui.intro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.IntroItem;

import java.util.ArrayList;

public class IntroViewModel extends ViewModel {

    private MutableLiveData<ArrayList<IntroItem>> introList;

    public IntroViewModel() {
        introList = new MutableLiveData<>();
        ArrayList<IntroItem> listOfItems = new ArrayList<>();
        listOfItems.add(new IntroItem(R.drawable.ic_intro_image_1,"Get Inspired from over 70,000 wedding photos."));
        listOfItems.add(new IntroItem(R.drawable.ic_intro_image_2,"Find the right vendor for you.\nThousand of trusted reviews"));
        listOfItems.add(new IntroItem(R.drawable.ic_intro_image_3,"Team up with your loved ones to plan your wedding."));
        introList.setValue(listOfItems);
    }

    public LiveData<ArrayList<IntroItem>> getIntroList() {
        return introList;
    }
}
