package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weddingplanner.database.AppExecutors;
import com.example.weddingplanner.database.WeddingPlannerDatabase;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.pojo.VendorListDetailItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VendorItemDetailsActivity extends AppCompatActivity {

    @BindView(R.id.tvName)
    TextView tvName;

    @BindView(R.id.tvAddress)
    TextView tvAddress;

    @BindView(R.id.image)
    ImageView image;

    @BindView(R.id.tvReviews)
    TextView tvReviews;

    @BindView(R.id.imageShortList)
    ImageView imageShortList;

    @BindView(R.id.tvDescription)
    TextView tvDescription;

    VendorListDetailItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_item_details);
        ButterKnife.bind(this);
        item = (VendorListDetailItem) getIntent().getSerializableExtra("item");
        if (item != null){
            tvName.setText(item.getName());
            tvAddress.setText(item.getLocation());
            image.setImageResource(item.getImage());
            tvReviews.setText(item.getReviews());
            tvDescription.setText(item.getDescription());
        }
    }


    @OnClick(R.id.imageShortList)
    void addItemToDb(){
        WeddingPlannerDatabase database = WeddingPlannerDatabase.getInstance(this);
        PlaceOrderItem placeOrderItem = new PlaceOrderItem(item.getImage(),item.getName(),item.getRating(), item.getReviews(), item.getLocation(), item.getPrice());
        /*AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                database.getWeddingPlannerDao().insertItem(placeOrderItem);
                imageShortList.setImageResource(R.drawable.ic_icon_ashortlist);
            }
        });*/
        database.getWeddingPlannerDao().insertItem(placeOrderItem);
        imageShortList.setImageResource(R.drawable.ic_icon_ashortlist);

    }


}
