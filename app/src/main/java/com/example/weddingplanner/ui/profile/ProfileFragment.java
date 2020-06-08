package com.example.weddingplanner.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.ShortListAdapter;
import com.example.weddingplanner.adapter.VendorListAdapter;
import com.example.weddingplanner.database.AppExecutors;
import com.example.weddingplanner.database.WeddingPlannerDatabase;
import com.example.weddingplanner.listener.IOnShortListedItemClickListener;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.ui.payment.CardActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileFragment extends Fragment {

    @BindView(R.id.profileRecyclerView)
    RecyclerView profileRecyclerView;

    private List<PlaceOrderItem> placeOrderItems;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        placeOrderItems = new ArrayList<>();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this,root);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fetchItemsFromDatabase();
    }


    private void fetchItemsFromDatabase(){
        WeddingPlannerDatabase appDb = WeddingPlannerDatabase.getInstance(getActivity());


        AppExecutors.getInstance().diskIO().execute(new Runnable() {
            @Override
            public void run() {
                placeOrderItems.clear();
                placeOrderItems = appDb.getWeddingPlannerDao().getItems();
                setAdapter(placeOrderItems);
            }
        });
    }

    private void setAdapter(List<PlaceOrderItem> placeOrderItems){
        ShortListAdapter adapter = new ShortListAdapter(placeOrderItems);
        profileRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new IOnShortListedItemClickListener() {
            @Override
            public void onItemClick(PlaceOrderItem item) {
                Intent intent = new Intent(getActivity(), CardActivity.class);
                intent.putExtra("item",item);
                startActivity(intent);
            }
        });
    }
}