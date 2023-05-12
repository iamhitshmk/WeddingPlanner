package com.example.weddingplanner.ui.vendor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.listener.IOnItemClickListener;
import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.VendorAdapter;
import com.example.weddingplanner.pojo.VendorItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VendorFragment extends Fragment {


    @BindView(R.id.vendorsRecyclerView)
    RecyclerView vendorsRecyclerView;


    private VendorViewModel vendorViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vendorViewModel = ViewModelProviders.of(this).get(VendorViewModel.class);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vendor, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        vendorViewModel.getVendorList().observe(getViewLifecycleOwner(), new Observer<ArrayList<VendorItem>>() {
            @Override
            public void onChanged(ArrayList<VendorItem> vendorItems) {
                setUpAdapter(vendorItems);
            }
        });
    }

    private void setUpAdapter(ArrayList<VendorItem> vendorItems){
        VendorAdapter adapter = new VendorAdapter(vendorItems);
        vendorsRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new IOnItemClickListener() {
            @Override
            public void onItemClick(int id) {
                Intent intent = new Intent(getActivity(),VendorListDetailsActivity.class);
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }
}