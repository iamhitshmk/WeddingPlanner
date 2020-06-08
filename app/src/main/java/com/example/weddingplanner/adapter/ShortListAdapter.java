package com.example.weddingplanner.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.R;
import com.example.weddingplanner.listener.IOnShortListedItemClickListener;
import com.example.weddingplanner.listener.IOnVendorItemClickListener;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.pojo.VendorListDetailItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShortListAdapter extends RecyclerView.Adapter<ShortListAdapter.ViewHolder>{

    private List<PlaceOrderItem> items;
    private IOnShortListedItemClickListener iOnItemClickListener;

    public ShortListAdapter(List<PlaceOrderItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ShortListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_vendor_details_list_item, parent, false);

        return new ShortListAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ShortListAdapter.ViewHolder holder, int position) {
        PlaceOrderItem item = items.get(position);
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

    public void setOnItemClickListener(IOnShortListedItemClickListener iOnItemClickListener) {
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
