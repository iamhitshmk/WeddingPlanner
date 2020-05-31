package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weddingplanner.pojo.VendorListDetailItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VendorItemDetailsActivity extends AppCompatActivity {

    @BindView(R.id.tvName)
    TextView tvName;

    @BindView(R.id.tvAddress)
    TextView tvAddress;

    @BindView(R.id.image)
    ImageView image;

    @BindView(R.id.tvReviews)
    TextView tvReviews;

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
        }
    }


}
