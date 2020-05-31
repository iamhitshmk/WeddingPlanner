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
        } else if (screen.equalsIgnoreCase("real_wedding")){
            listOfImages = getRealWeddingImagesBasedOnId(id);
        } else {
             listOfImages = getArticleImagesBasedOnID(id);
        }
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

    private ArrayList<Integer> getRealWeddingImagesBasedOnId(int id){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        switch (id){
            case 1:
                list.add(R.drawable.ic_rw_aman_niti_1);
                list.add(R.drawable.ic_rw_aman_niti_2);
                list.add(R.drawable.ic_rw_aman_niti_3);
                list.add(R.drawable.ic_rw_aman_niti_4);
                list.add(R.drawable.ic_rw_aman_niti_5);
                list.add(R.drawable.ic_rw_aman_niti_6);
                break;

            case 2:
                list.add(R.drawable.ic_rw_ashritha_yashwant_1);
                list.add(R.drawable.ic_rw_ashritha_yashwant_2);
                list.add(R.drawable.ic_rw_ashritha_yashwant_3);
                list.add(R.drawable.ic_rw_ashritha_yashwant_4);
                break;


            case 3:
                list.add(R.drawable.ic_rw_palak_chirag_1);
                list.add(R.drawable.ic_rw_palak_chirag_2);
                list.add(R.drawable.ic_rw_palak_chirag_3);
                list.add(R.drawable.ic_rw_palak_chirag_4);
                list.add(R.drawable.ic_rw_palak_chirag_5);
                list.add(R.drawable.ic_rw_palak_chirag_6);
                break;


            case 4:
                list.add(R.drawable.ic_rw_prachi_mohit_1);
                list.add(R.drawable.ic_rw_prachi_mohit_2);
                list.add(R.drawable.ic_rw_prachi_mohit_3);
                list.add(R.drawable.ic_rw_prachi_mohit_4);
                list.add(R.drawable.ic_rw_prachi_mohit_5);
                list.add(R.drawable.ic_rw_prachi_mohit_6);
                list.add(R.drawable.ic_rw_prachi_mohit_7);
                break;


            case 5:
                list.add(R.drawable.ic_rw_shailesh_divya_1);
                list.add(R.drawable.ic_rw_shailesh_divya_2);
                list.add(R.drawable.ic_rw_shailesh_divya_3);
                list.add(R.drawable.ic_rw_shailesh_divya_4);
                list.add(R.drawable.ic_rw_shailesh_divya_5);
                list.add(R.drawable.ic_rw_shailesh_divya_6);
                break;


            case 6:
                list.add(R.drawable.ic_rw_shekhar_madhuri_1);
                list.add(R.drawable.ic_rw_shekhar_madhuri_2);
                list.add(R.drawable.ic_rw_shekhar_madhuri_3);
                list.add(R.drawable.ic_rw_shekhar_madhuri_4);
                list.add(R.drawable.ic_rw_shekhar_madhuri_5);
                list.add(R.drawable.ic_rw_shekhar_madhuri_6);
                list.add(R.drawable.ic_rw_shekhar_madhuri_7);
                list.add(R.drawable.ic_rw_shekhar_madhuri_8);
                list.add(R.drawable.ic_rw_shekhar_madhuri_9);
                break;
            case 7:
                list.add(R.drawable.ic_rw_shivali_abhjeet_1);
                list.add(R.drawable.ic_rw_shivali_abhjeet_2);
                list.add(R.drawable.ic_rw_shivali_abhjeet_3);
                list.add(R.drawable.ic_rw_shivali_abhjeet_4);
                list.add(R.drawable.ic_rw_shivali_abhjeet_5);
                break;
            case 8:
                list.add(R.drawable.ic_rw_sonal_akash_1);
                list.add(R.drawable.ic_rw_sonal_akash_2);
                list.add(R.drawable.ic_rw_sonal_akash_3);
                list.add(R.drawable.ic_rw_sonal_akash_4);
                list.add(R.drawable.ic_rw_sonal_akash_5);
                list.add(R.drawable.ic_rw_sonal_akash_6);
                list.add(R.drawable.ic_rw_sonal_akash_7);
                list.add(R.drawable.ic_rw_sonal_akash_8);
                break;
            case 9:
                list.add(R.drawable.ic_rw_sumaan_ishaan_1);
                list.add(R.drawable.ic_rw_sumaan_ishaan_2);
                list.add(R.drawable.ic_rw_sumaan_ishaan_3);
                list.add(R.drawable.ic_rw_sumaan_ishaan_4);
                list.add(R.drawable.ic_rw_sumaan_ishaan_5);
                list.add(R.drawable.ic_rw_sumaan_ishaan_6);
                break;
            case 10:
                list.add(R.drawable.ic_rw_swati_kamlesh_1);
                list.add(R.drawable.ic_rw_swati_kamlesh_2);
                list.add(R.drawable.ic_rw_swati_kamlesh_3);
                list.add(R.drawable.ic_rw_swati_kamlesh_4);
                list.add(R.drawable.ic_rw_swati_kamlesh_5);
                list.add(R.drawable.ic_rw_swati_kamlesh_6);
                list.add(R.drawable.ic_rw_swati_kamlesh_7);
                list.add(R.drawable.ic_rw_swati_kamlesh_8);
                break;
        }
        return list;
    }
    private ArrayList<Integer> getArticleImagesBasedOnID(int id){
        ArrayList<Integer> list = new ArrayList<>();
        list.clear();
        switch (id){
            case 1:
                list.add(R.drawable.ic_article_1);
                break;

            case 2:
                list.add(R.drawable.ic_article_2);
                break;


            case 3:
                list.add(R.drawable.ic_article_3);

                break;


            case 4:
                list.add(R.drawable.ic_article_4);

                break;


            case 5:
                list.add(R.drawable.ic_article_5);

                break;


            case 6:
                list.add(R.drawable.ic_article_6);
                break;
            case 7:
                list.add(R.drawable.ic_article_7);
                break;
            case 8:
                list.add(R.drawable.ic_article_8);
                break;
            case 9:
                list.add(R.drawable.ic_article_9);
                break;
            case 10:
                list.add(R.drawable.ic_article_10);
                break;
            case 11:
                list.add(R.drawable.ic_article_11);
                break;
            case 12:
                list.add(R.drawable.ic_article_12);
                break;
            case 13:
                list.add(R.drawable.ic_article_13);
                break;
            case 14:
                list.add(R.drawable.ic_article_14);
                break;
            case 15:
                list.add(R.drawable.ic_article_15);
                break;
            case 16:
                list.add(R.drawable.ic_article_16);
                break;
            case 17:
                list.add(R.drawable.ic_article_17);
                break;
            case 18:
                list.add(R.drawable.ic_article_18);
                break;
            case 19:
                list.add(R.drawable.ic_article_19);
                break;
            case 20:
                list.add(R.drawable.ic_article_20);
                break;
            case 21:
                list.add(R.drawable.ic_article_21);
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
