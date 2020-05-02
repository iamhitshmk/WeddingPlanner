package com.example.weddingplanner.ui.inspiration.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.PhotosItem;

import java.util.ArrayList;

public class PhotosViewModel extends ViewModel {

    private MutableLiveData<ArrayList<PhotosItem>> photosList;

    public PhotosViewModel() {
        photosList = new MutableLiveData<>();
        ArrayList<PhotosItem> listOfItems = new ArrayList<>();
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_one,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_two,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_three,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_four,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_five,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_six,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_seven,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_eight,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_ten,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_11,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_12,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_13,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_14,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_15,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_16,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_17,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_18,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_19,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_20,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_21,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_22,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_23,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_24,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_25,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_26,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_27,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_28,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_29,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_30,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_31,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_32,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_33,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_34,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_35,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_36,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_37,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_38,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_39,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_40,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_41,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_42,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_43,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_44,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_45,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_46,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_47,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_48,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_49,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_50,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        photosList.setValue(listOfItems);
    }

    public LiveData<ArrayList<PhotosItem>> getPhotosList() {

        return photosList;
    }
}
