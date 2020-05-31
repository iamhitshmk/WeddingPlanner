package com.example.weddingplanner.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.listener.IOnItemClickListener;
import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.MoreMenuItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoreMenuAdapter extends RecyclerView.Adapter<MoreMenuAdapter.ViewHolder> {

    private IOnItemClickListener iOnItemClickListener;
    private ArrayList<MoreMenuItem> moreMenuItems;

    public MoreMenuAdapter(ArrayList<MoreMenuItem> moreMenuItems) {
        this.moreMenuItems = moreMenuItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_more_menu_item, parent, false);

        return new MoreMenuAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MoreMenuItem item = moreMenuItems.get(position);
        holder.moreMenuImageView.setImageResource(item.getImage());
        holder.moreMenuTitle.setText(item.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnItemClickListener.onItemClick(item.getId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return moreMenuItems.size();
    }

    public void setOnItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.moreMenuImageView)
        ImageView moreMenuImageView;

        @BindView(R.id.moreMenuTitle)
        TextView moreMenuTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
