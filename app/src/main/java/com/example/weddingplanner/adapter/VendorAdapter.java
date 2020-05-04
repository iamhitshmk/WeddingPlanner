package com.example.weddingplanner.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.IOnItemClickListener;
import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.VendorItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VendorAdapter extends RecyclerView.Adapter<VendorAdapter.ViewHolder> {

    private ArrayList<VendorItem> vendorItems;
    private IOnItemClickListener iOnItemClickListener;
    public VendorAdapter(ArrayList<VendorItem> vendorItems) {
        this.vendorItems = vendorItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_vendor_item, parent, false);

        return new VendorAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VendorItem item = vendorItems.get(position);
        holder.imgVendor.setImageResource(item.getVendorImage());
        holder.tvVendorName.setText(item.getVendorName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnItemClickListener.onItemClick(item.getVendorId());
            }
        });
    }

    public void setOnItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }


    @Override
    public int getItemCount() {
        return vendorItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgVendor)
        ImageView imgVendor;

        @BindView(R.id.tvVendorName)
        TextView tvVendorName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
