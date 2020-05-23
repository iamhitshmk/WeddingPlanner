package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weddingplanner.adapter.PhotoDetailAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotoDetailActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    int id;
    String screen;

    ArrayList<Integer> listOfImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);
        ButterKnife.bind(this);
        id = getIntent().getIntExtra("id",-1);
        screen = getIntent().getStringExtra("screen");
        if (screen.equalsIgnoreCase("photos")){
            listOfImages = getPhotoImagesBasedOnId(id);
        } else {
            listOfImages = getRealWeddingImagesBasedOnId(id);
        }
        setUpAdapter(listOfImages);

    }

    private ArrayList<Integer> getPhotoImagesBasedOnId(int id){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        switch (id){
            case 1:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;

            case 2:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 3:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 4:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 5:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 6:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;

        }
        return list;
    }

    private ArrayList<Integer> getRealWeddingImagesBasedOnId(int id){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        switch (id){
            case 1:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;

            case 2:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 3:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 4:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 5:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;


            case 6:
                list.add(R.drawable.ic_photos_one);
                list.add(R.drawable.ic_photos_two);
                list.add(R.drawable.ic_photos_three);
                list.add(R.drawable.ic_photos_four);
                break;

        }
        return list;
    }

    private void setUpAdapter(ArrayList<Integer> listOfImages){
        PhotoDetailAdapter detailAdapter = new PhotoDetailAdapter(listOfImages);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(detailAdapter);

    }
}
