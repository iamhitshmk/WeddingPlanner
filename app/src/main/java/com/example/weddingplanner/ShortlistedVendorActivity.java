package com.example.weddingplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.weddingplanner.adapter.ShortListAdapter;
import com.example.weddingplanner.database.AppExecutors;
import com.example.weddingplanner.database.WeddingPlannerDatabase;
import com.example.weddingplanner.listener.IOnShortListedItemClickListener;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.ui.payment.CardActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShortlistedVendorActivity extends AppCompatActivity {

    @BindView(R.id.shortListedRecyclerView)
    RecyclerView shortListedRecyclerView;

    @BindView(R.id.btnProceed)
    Button btnProceed;

    private List<PlaceOrderItem> placeOrderItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortlisted_vendor);
        ButterKnife.bind(this);
        placeOrderItems = new ArrayList<>();
        fetchItemsFromDatabase();
    }

    private void fetchItemsFromDatabase(){
        WeddingPlannerDatabase appDb = WeddingPlannerDatabase.getInstance(this);
        /*AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {

            }
        });*/
        placeOrderItems.clear();
        placeOrderItems = appDb.getWeddingPlannerDao().getItems();
        setAdapter(placeOrderItems);
        if (placeOrderItems.size() > 0){
            btnProceed.setVisibility(View.VISIBLE);
        } else {
            btnProceed.setVisibility(View.GONE);
        }
    }

    private void setAdapter(List<PlaceOrderItem> placeOrderItems){
        ShortListAdapter adapter = new ShortListAdapter(placeOrderItems);
        shortListedRecyclerView.setAdapter(adapter);
    }

    @OnClick(R.id.btnProceed)
    void proceedToPayment(){
        ArrayList<PlaceOrderItem> list = new ArrayList<>(placeOrderItems);
        Intent intent = new Intent(ShortlistedVendorActivity.this, CardActivity.class);
        intent.putParcelableArrayListExtra("item",list);
        startActivity(intent);
    }
}