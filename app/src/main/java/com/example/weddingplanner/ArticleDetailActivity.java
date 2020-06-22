package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArticleDetailActivity extends AppCompatActivity {

    @BindView(R.id.image)
    ImageView image;

    @BindView(R.id.tvDescription)
    TextView tvDescription;

    String screen;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);
        ButterKnife.bind(this);
        screen = getIntent().getStringExtra("screen");
        id = getIntent().getIntExtra("id",-1);
        if (screen.equalsIgnoreCase("real_wedding")){
            getRealWeddingImagesBasedOnId(id);
        } else {
            getArticleImagesBasedOnID(id);
        }
    }

    private void getRealWeddingImagesBasedOnId(int id){

        switch (id){
            case 1:
                image.setImageResource(R.drawable.ic_rw_aman_niti_1);
                tvDescription.setText("Add Description");
                break;

            case 2:
                image.setImageResource(R.drawable.ic_rw_ashritha_yashwant_1);
                tvDescription.setText("Add Description");
                break;


            case 3:
                image.setImageResource(R.drawable.ic_rw_palak_chirag_1);
                tvDescription.setText("Add Description");
                break;


            case 4:
                image.setImageResource(R.drawable.ic_rw_prachi_mohit_1);
                tvDescription.setText("Add Description");
                break;


            case 5:
                image.setImageResource(R.drawable.ic_rw_shailesh_divya_1);
                tvDescription.setText("Add Description");
                break;


            case 6:
                image.setImageResource(R.drawable.ic_rw_shekhar_madhuri_1);
                tvDescription.setText("Add Description");
                break;

            case 7:
                image.setImageResource(R.drawable.ic_rw_shivali_abhjeet_1);
                tvDescription.setText("Add Description");
                break;

            case 8:
                image.setImageResource(R.drawable.ic_rw_sonal_akash_1);
                tvDescription.setText("Add Description");
                break;

            case 9:
                image.setImageResource(R.drawable.ic_rw_sumaan_ishaan_1);
                tvDescription.setText("Add Description");
                break;

            case 10:
                image.setImageResource(R.drawable.ic_rw_swati_kamlesh_1);
                tvDescription.setText("Add Description");
                break;
        }
    }
    private void getArticleImagesBasedOnID(int id){
        switch (id){
            case 1:
                image.setImageResource(R.drawable.ic_article_1);
                tvDescription.setText("Add Description");
                break;

            case 2:
                image.setImageResource(R.drawable.ic_article_2);
                tvDescription.setText("Add Description");
                break;


            case 3:
                image.setImageResource(R.drawable.ic_article_3);
                tvDescription.setText("Add Description");

                break;


            case 4:
                image.setImageResource(R.drawable.ic_article_4);
                tvDescription.setText("Add Description");
                break;


            case 5:
                image.setImageResource(R.drawable.ic_article_5);
                tvDescription.setText("Add Description");
                break;


            case 6:
                image.setImageResource(R.drawable.ic_article_6);
                tvDescription.setText("Add Description");
                break;

            case 7:
                image.setImageResource(R.drawable.ic_article_7);
                tvDescription.setText("Add Description");
                break;

            case 8:
                image.setImageResource(R.drawable.ic_article_8);
                tvDescription.setText("Add Description");
                break;

            case 9:
                image.setImageResource(R.drawable.ic_article_9);
                tvDescription.setText("Add Description");
                break;

            case 10:
                image.setImageResource(R.drawable.ic_article_10);
                tvDescription.setText("Add Description");
                break;

            case 11:
                image.setImageResource(R.drawable.ic_article_11);
                tvDescription.setText("Add Description");
                break;

            case 12:
                image.setImageResource(R.drawable.ic_article_12);
                tvDescription.setText("Add Description");
                break;

            case 13:
                image.setImageResource(R.drawable.ic_article_13);
                tvDescription.setText("Add Description");
                break;

            case 14:
                image.setImageResource(R.drawable.ic_article_14);
                tvDescription.setText("Add Description");
                break;

            case 15:
                image.setImageResource(R.drawable.ic_article_15);
                tvDescription.setText("Add Description");
                break;

            case 16:
                image.setImageResource(R.drawable.ic_article_16);
                tvDescription.setText("Add Description");
                break;

            case 17:
                image.setImageResource(R.drawable.ic_article_17);
                tvDescription.setText("Add Description");
                break;

            case 18:
                image.setImageResource(R.drawable.ic_article_18);
                tvDescription.setText("Add Description");
                break;

            case 19:
                image.setImageResource(R.drawable.ic_article_19);
                tvDescription.setText("Add Description");
                break;

            case 20:
                image.setImageResource(R.drawable.ic_article_20);
                tvDescription.setText("Add Description");
                break;

            case 21:
                image.setImageResource(R.drawable.ic_article_21);
                tvDescription.setText("Add Description");
                break;

        }

    }
}