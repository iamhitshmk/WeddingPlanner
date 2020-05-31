package com.example.weddingplanner.ui.inspiration.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.listener.IOnItemClickListener;
import com.example.weddingplanner.PhotoDetailActivity;
import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.RealWeddingAdapter;
import com.example.weddingplanner.pojo.RealWeddingItem;
import com.example.weddingplanner.ui.inspiration.viewModel.RealWeddingViewModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RealWeddingsFragment extends Fragment {

    @BindView(R.id.realWeddingRecyclerView)
    RecyclerView realWeddingRecyclerView;

    private RealWeddingViewModel realWeddingViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        realWeddingViewModel = ViewModelProviders.of(this).get(RealWeddingViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_real_weddings, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        realWeddingViewModel.getRealWeddingList().observe(this, new Observer<ArrayList<RealWeddingItem>>() {
            @Override
            public void onChanged(ArrayList<RealWeddingItem> realWeddingItems) {
                setUpAdapter(realWeddingItems);
            }
        });
    }

    private void setUpAdapter(ArrayList<RealWeddingItem> realWeddingItems){
        RealWeddingAdapter adapter = new RealWeddingAdapter(realWeddingItems);
        realWeddingRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new IOnItemClickListener() {
            @Override
            public void onItemClick(int id) {
                Intent intent = new Intent(getActivity(), PhotoDetailActivity.class);
                intent.putExtra("screen","real_wedding");
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }
}
