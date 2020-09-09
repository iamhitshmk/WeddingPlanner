package com.example.weddingplanner.ui.viewOrders;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.ViewOrdersAdapter;
import com.example.weddingplanner.listener.IOnInboxItemListener;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.pojo.TransactionItem;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewOrdersActivity extends AppCompatActivity {

    @BindView(R.id.viewOrdersRecyclerView)
    RecyclerView viewOrdersRecyclerView;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    @BindView(R.id.tvNoDataFound)
    TextView tvNoDataFound;

    ArrayList<TransactionItem> viewAllOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_orders);
        ButterKnife.bind(this);
        viewAllOrders = new ArrayList<>();
        fetchOrdersFromFirebase();
    }


    private void fetchOrdersFromFirebase(){
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("add_order").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                progressBar.setVisibility(View.GONE);
                for (DataSnapshot orderDataSnapshot : dataSnapshot.getChildren()) {
                    TransactionItem item = orderDataSnapshot.getValue(TransactionItem.class);
                    if (item != null){
                        viewAllOrders.add(item);
                    }
                }

                if (viewAllOrders.size() > 0){
                    tvNoDataFound.setVisibility(View.GONE);
                    viewOrdersRecyclerView.setVisibility(View.VISIBLE);
                    setAdapter(viewAllOrders);
                } else {
                    tvNoDataFound.setVisibility(View.VISIBLE);
                    viewOrdersRecyclerView.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    private void setAdapter(ArrayList<TransactionItem> orderItems){
        ViewOrdersAdapter adapter = new ViewOrdersAdapter(orderItems);
        viewOrdersRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new IOnInboxItemListener() {
            @Override
            public void onItemClick(TransactionItem item) {
                Intent intent = new Intent(
                        ViewOrdersActivity.this,OrderDetailsActivity.class
                );

                intent.putExtra("item" , item);
                startActivity(intent);
            }
        });
    }


}
