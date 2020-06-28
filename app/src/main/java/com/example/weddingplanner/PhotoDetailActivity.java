package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.weddingplanner.adapter.PhotoDetailAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PhotoDetailActivity extends AppCompatActivity {

    @BindView(R.id.image)
    ImageView image;

    @BindView(R.id.imgHeart)
    ImageView imgHeart;

    int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);
        ButterKnife.bind(this);
        id = getIntent().getIntExtra("id",-1);
        getPhotoImagesBasedOnId(id);
    }

    private void getPhotoImagesBasedOnId(int id){

        switch (id){
            case 1:
                image.setImageResource(R.drawable.ic_photos_one);
                break;

            case 2:
                image.setImageResource(R.drawable.ic_photos_two);
                break;


            case 3:
                image.setImageResource(R.drawable.ic_photos_three);
                break;


            case 4:
                image.setImageResource(R.drawable.ic_photos_four);
                break;

            case 5:
                image.setImageResource(R.drawable.ic_photos_five);
                break;


            case 6:
                image.setImageResource(R.drawable.ic_photos_six);
                break;

            case 7:
                image.setImageResource(R.drawable.ic_photos_seven);
                break;

            case 8:
                image.setImageResource(R.drawable.ic_photos_eight);
                break;

            case 9:
                image.setImageResource(R.drawable.ic_photos_nine);
                break;

            case 10:
                image.setImageResource(R.drawable.ic_photos_ten);
                break;

            case 11:
                image.setImageResource(R.drawable.ic_photos_11);
                break;

            case 12:
                image.setImageResource(R.drawable.ic_photos_12);
                break;

            case 13:
                image.setImageResource(R.drawable.ic_photos_13);
                break;

            case 14:
                image.setImageResource(R.drawable.ic_photos_14);
                break;

            case 15:
                image.setImageResource(R.drawable.ic_photos_15);
                break;

            case 16:
                image.setImageResource(R.drawable.ic_photos_16);
                break;

            case 17:
                image.setImageResource(R.drawable.ic_photos_17);
                break;

            case 18:
                image.setImageResource(R.drawable.ic_photos_18);
                break;

            case 19:
                image.setImageResource(R.drawable.ic_photos_19);
                break;

            case 20:
                image.setImageResource(R.drawable.ic_photos_20);
                break;

            case 21:
                image.setImageResource(R.drawable.ic_photos_21);
                break;

            case 22:
                image.setImageResource(R.drawable.ic_photos_22);
                break;

            case 23:
                image.setImageResource(R.drawable.ic_photos_23);
                break;

            case 24:
                image.setImageResource(R.drawable.ic_photos_24);
                break;
                
            case 25:
                image.setImageResource(R.drawable.ic_photos_25);
                break;
                
            case 26:
                image.setImageResource(R.drawable.ic_photos_26);
                break;
                
            case 27:
                image.setImageResource(R.drawable.ic_photos_27);
                break;
                
            case 28:
                image.setImageResource(R.drawable.ic_photos_28);
                break;
                
            case 29:
                image.setImageResource(R.drawable.ic_photos_29);
                break;
                
            case 30:
                image.setImageResource(R.drawable.ic_photos_30);
                break;
                
            case 31:
                image.setImageResource(R.drawable.ic_photos_31);
                break;
                
            case 32:
                image.setImageResource(R.drawable.ic_photos_32);
                break;
                
            case 33:
                image.setImageResource(R.drawable.ic_photos_33);
                break;
                
            case 34:
                image.setImageResource(R.drawable.ic_photos_34);
                break;
                
            case 35:
                image.setImageResource(R.drawable.ic_photos_35);
                break;
                
            case 36:
                image.setImageResource(R.drawable.ic_photos_36);
                break;
                
            case 37:
                image.setImageResource(R.drawable.ic_photos_37);
                break;
                
            case 38:
                image.setImageResource(R.drawable.ic_photos_38);
                break;
                
            case 39:
                image.setImageResource(R.drawable.ic_photos_39);
                break;
                
            case 40:
                image.setImageResource(R.drawable.ic_photos_40);
                break;
                
            case 41:
                image.setImageResource(R.drawable.ic_photos_41);
                break;
                
            case 42:
                image.setImageResource(R.drawable.ic_photos_42);
                break;
                
            case 43:
                image.setImageResource(R.drawable.ic_photos_43);
                break;
                
            case 44:
                image.setImageResource(R.drawable.ic_photos_44);
                break;
                
            case 45:
                image.setImageResource(R.drawable.ic_photos_45);
                break;
                
            case 46:
                image.setImageResource(R.drawable.ic_photos_46);
                break;
                
            case 47:
                image.setImageResource(R.drawable.ic_photos_47);
                break;
                
            case 48:
                image.setImageResource(R.drawable.ic_photos_48);
                break;
                
            case 49:
                image.setImageResource(R.drawable.ic_photos_49);
                break;
                
            case 50:
                image.setImageResource(R.drawable.ic_photos_50);
                break;
                
        }
    }

    @OnClick(R.id.imgHeart)
    void onHeartImageClicked(){
        if (imgHeart.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.ic_shortlist_heart).getConstantState()){
            imgHeart.setImageResource(R.drawable.ic_icon_ashortlist);
        } else {
            imgHeart.setImageResource(R.drawable.ic_shortlist_heart);
        }
    }


}
