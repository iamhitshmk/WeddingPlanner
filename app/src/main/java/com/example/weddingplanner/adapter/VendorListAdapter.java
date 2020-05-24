package com.example.weddingplanner.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.IOnVendorItemClickListener;
import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.VendorListDetailItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VendorListAdapter extends RecyclerView.Adapter<VendorListAdapter.ViewHolder> {

    private ArrayList<VendorListDetailItem> items;
    private IOnVendorItemClickListener iOnItemClickListener;

    public VendorListAdapter(ArrayList<VendorListDetailItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_vendor_details_list_item, parent, false);

        return new VendorListAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VendorListDetailItem item = items.get(position);
        holder.imgVendor.setImageResource(item.getImage());
        holder.tvName.setText(item.getName());
        holder.tvLocation.setText(item.getLocation());
        holder.tvRating.setText(item.getRating());
        holder.tvReviews.setText(item.getReviews());
        holder.tvPrice.setText(item.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnItemClickListener.onItemClick(item);
            }
        });
    }

    public void setOnItemClickListener(IOnVendorItemClickListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgVendor)
        ImageView imgVendor;

        @BindView(R.id.tvName)
        TextView tvName;

        @BindView(R.id.tvRating)
        TextView tvRating;

        @BindView(R.id.tvReviews)
        TextView tvReviews;

        @BindView(R.id.tvLocation)
        TextView tvLocation;

        @BindView(R.id.tvPrice)
        TextView tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
