package com.example.weddingplanner.ui.vendor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.weddingplanner.IOnVendorItemClickListener;
import com.example.weddingplanner.R;
import com.example.weddingplanner.VendorItemDetailsActivity;
import com.example.weddingplanner.adapter.VendorListAdapter;
import com.example.weddingplanner.pojo.VendorListDetailItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VendorListDetailsActivity extends AppCompatActivity {


    @BindView(R.id.vendorListRecyclerView)
    RecyclerView vendorListRecyclerView;

    private VendorListDetailsViewModel vendorListDetailsViewModel;
    private int vendorId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_list_details);
        ButterKnife.bind(this);
        vendorId = getIntent().getIntExtra("id",-1);
        vendorListDetailsViewModel = ViewModelProviders.of(this).get(VendorListDetailsViewModel.class);
        observeData();

    }


    private void observeData(){
        LiveData<ArrayList<VendorListDetailItem>> data = null;
        switch (vendorId){
            case 1:
                data = vendorListDetailsViewModel.getWeddingCakesData();
                break;

            case 2:
                data = vendorListDetailsViewModel.getWeddingCardsData();
                break;


            case 3:
                data = vendorListDetailsViewModel.getWeddingCateringData();
                break;


            case 4:
                data = vendorListDetailsViewModel.getWeddingDecoratorsData();
                break;

            case 5:
                data = vendorListDetailsViewModel.getWeddingDJData();
                break;

            case 6:
                data = vendorListDetailsViewModel.getWeddingMehendiData();
                break;


            case 7:
                data = vendorListDetailsViewModel.getWeddingPanditsData();
                break;


            case 8:
                data = vendorListDetailsViewModel.getWeddingPhotographersData();
                break;

            case 9:
                data = vendorListDetailsViewModel.getWeddingVenuesData();
                break;

            case 10:
                data = vendorListDetailsViewModel.getWeddingMakeupData();
                break;



        }


        if (data != null){
            data.observe(this, new Observer<ArrayList<VendorListDetailItem>>() {
                @Override
                public void onChanged(ArrayList<VendorListDetailItem> items) {
                    setUpAdapter(items);
                }
            });
        }


    }

    private void setUpAdapter(ArrayList<VendorListDetailItem> items){
        VendorListAdapter adapter = new VendorListAdapter(items);
        vendorListRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new IOnVendorItemClickListener() {
            @Override
            public void onItemClick(VendorListDetailItem item) {
                Intent intent = new Intent(VendorListDetailsActivity.this, VendorItemDetailsActivity.class);
                intent.putExtra("item",item);
                startActivity(intent);
            }
        });
    }
}
