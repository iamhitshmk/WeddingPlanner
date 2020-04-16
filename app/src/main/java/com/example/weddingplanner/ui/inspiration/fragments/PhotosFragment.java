package com.example.weddingplanner.ui.inspiration.fragments;

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

import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.PhotosAdapter;
import com.example.weddingplanner.pojo.PhotosItem;
import com.example.weddingplanner.ui.inspiration.viewModel.PhotosViewModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotosFragment extends Fragment {

    @BindView(R.id.photosRecyclerView)
    RecyclerView photosRecyclerView;

    PhotosViewModel photosViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        photosViewModel = ViewModelProviders.of(this).get(PhotosViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photos, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        photosViewModel.getPhotosList().observe(this, new Observer<ArrayList<PhotosItem>>() {
            @Override
            public void onChanged(ArrayList<PhotosItem> photosItems) {
                setUpAdapter(photosItems);
            }
        });
    }

    private void setUpAdapter(ArrayList<PhotosItem> photosItems){
        PhotosAdapter adapter = new PhotosAdapter(photosItems);
        photosRecyclerView.setAdapter(adapter);
    }
}
