package com.example.weddingplanner.ui.viewOrders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.OrderDetailsAdapter;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.pojo.TransactionItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderDetailsActivity extends AppCompatActivity {

    @BindView(R.id.viewOrdersRecyclerView)
    RecyclerView viewOrdersRecyclerView;

    TransactionItem item ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        ButterKnife.bind(this);
        item = getIntent().getParcelableExtra("item");
        if (item != null){
            setAdapter(item.getItems()
            );
        }
    }

    private  void setAdapter(ArrayList<PlaceOrderItem> items){
        OrderDetailsAdapter adapter = new OrderDetailsAdapter(items);
        viewOrdersRecyclerView.setAdapter(adapter);
    }
}
