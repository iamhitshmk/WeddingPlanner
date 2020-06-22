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


    ArrayList<Integer> listOfImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);
        ButterKnife.bind(this);
        id = getIntent().getIntExtra("id",-1);
        listOfImages = getPhotoImagesBasedOnId(id);
        setUpAdapter(listOfImages);

    }

    private ArrayList<Integer> getPhotoImagesBasedOnId(int id){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        switch (id){
            case 1:
                list.add(R.drawable.ic_photos_one);
                break;

            case 2:
                list.add(R.drawable.ic_photos_two);
                break;


            case 3:
                list.add(R.drawable.ic_photos_three);
                break;


            case 4:
                list.add(R.drawable.ic_photos_four);
                break;

            case 5:
                list.add(R.drawable.ic_photos_five);
                break;


            case 6:
                list.add(R.drawable.ic_photos_six);
                break;

            case 7:
                list.add(R.drawable.ic_photos_seven);
                break;

            case 8:
                list.add(R.drawable.ic_photos_eight);
                break;
            case 9:
                list.add(R.drawable.ic_photos_nine);
                break;

            case 10:
                list.add(R.drawable.ic_photos_ten);
                break;
            case 11:
                list.add(R.drawable.ic_photos_11);
                break;


            case 12:
                list.add(R.drawable.ic_photos_12);
                break;

                case 13:
                    list.add(R.drawable.ic_photos_13);
                    break;
            case 14:
                list.add(R.drawable.ic_photos_14);
                break;
            case 15:
                list.add(R.drawable.ic_photos_15);
                break;

            case 16:
                list.add(R.drawable.ic_photos_16);
                break;
            case 17:
                list.add(R.drawable.ic_photos_17);
                break;
            case 18:
                list.add(R.drawable.ic_photos_18);
                break;
            case 19:
                list.add(R.drawable.ic_photos_19);
                break;
            case 20:
                list.add(R.drawable.ic_photos_20);
                break;
            case 21:
                list.add(R.drawable.ic_photos_21);
                break;
            case 22:
                list.add(R.drawable.ic_photos_22);
                break;
            case 23:
                list.add(R.drawable.ic_photos_23);
                break;
            case 24:
                list.add(R.drawable.ic_photos_24);
                break;
            case 25:
                list.add(R.drawable.ic_photos_25);
                break;
            case 26:
                list.add(R.drawable.ic_photos_26);
                break;
            case 27:
                list.add(R.drawable.ic_photos_27);
                break;
            case 28:
                list.add(R.drawable.ic_photos_28);
                break;
            case 29:
                list.add(R.drawable.ic_photos_29);
                break;
            case 30:
                list.add(R.drawable.ic_photos_30);
                break;
            case 31:
                list.add(R.drawable.ic_photos_31);
                break;
            case 32:
                list.add(R.drawable.ic_photos_32);
                break;
            case 33:
                list.add(R.drawable.ic_photos_33);
                break;
            case 34:
                list.add(R.drawable.ic_photos_34);
                break;
            case 35:
                list.add(R.drawable.ic_photos_35);
                break;
            case 36:
                list.add(R.drawable.ic_photos_36);
                break;
            case 37:
                list.add(R.drawable.ic_photos_37);
                break;
            case 38:
                list.add(R.drawable.ic_photos_38);
                break;
            case 39:
                list.add(R.drawable.ic_photos_39);
                break;
            case 40:
                list.add(R.drawable.ic_photos_40);
                break;
            case 41:
                list.add(R.drawable.ic_photos_41);
                break;
            case 42:
                list.add(R.drawable.ic_photos_42);
                break;
            case 43:
                list.add(R.drawable.ic_photos_43);
                break;
            case 44:
                list.add(R.drawable.ic_photos_44);
                break;
            case 45:
                list.add(R.drawable.ic_photos_45);
                break;
            case 46:
                list.add(R.drawable.ic_photos_46);
                break;
            case 47:
                list.add(R.drawable.ic_photos_47);
                break;
            case 48:
                list.add(R.drawable.ic_photos_48);
                break;
            case 49:
                list.add(R.drawable.ic_photos_49);
                break;
            case 50:
                list.add(R.drawable.ic_photos_50);
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
