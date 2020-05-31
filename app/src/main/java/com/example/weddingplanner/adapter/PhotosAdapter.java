package com.example.weddingplanner.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.listener.IOnItemClickListener;
import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.PhotosItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.ViewHolder> {

    ArrayList<PhotosItem> photosItems;
    private IOnItemClickListener iOnItemClickListener;
    public final int FULL_VIEW = 1;
    public final int SPAN_VIEW = 2;

    public PhotosAdapter(ArrayList<PhotosItem> photosItems) {
        this.photosItems = photosItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_photos_item, parent, false);
        return new PhotosAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PhotosItem item = photosItems.get(position);
        holder.photosImage.setImageResource(item.getPhotosImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnItemClickListener.onItemClick(item.getId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return photosItems.size();
    }

    public void setOnItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 3 == 0){
            return FULL_VIEW;
        }
        else {
            return SPAN_VIEW;
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.photosImage)
        ImageView photosImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
