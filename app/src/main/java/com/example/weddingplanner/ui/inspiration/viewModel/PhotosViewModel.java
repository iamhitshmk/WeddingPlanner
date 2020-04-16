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
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_one,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_two,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_three,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_one,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_two,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        listOfItems.add(new PhotosItem(R.drawable.ic_photos_three,"Boat Neck Blouse Designs We Are Totally Crushing On!",""));
        photosList.setValue(listOfItems);
    }

    public LiveData<ArrayList<PhotosItem>> getPhotosList() {
        return photosList;
    }
}
