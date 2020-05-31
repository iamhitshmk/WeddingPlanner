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
import com.example.weddingplanner.pojo.RealWeddingItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RealWeddingAdapter extends RecyclerView.Adapter<RealWeddingAdapter.ViewHolder> {

    private ArrayList<RealWeddingItem> realWeddingItems;
    private IOnItemClickListener iOnItemClickListener;

    public RealWeddingAdapter(ArrayList<RealWeddingItem> realWeddingItems) {
        this.realWeddingItems = realWeddingItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_real_weddings_item, parent, false);

        return new RealWeddingAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RealWeddingItem item = realWeddingItems.get(position);
        holder.imgRealWedding.setImageResource(item.getRealWeddingImage());
        holder.tvTitle.setText(item.getTitle());
        holder.tvDescription.setText(item.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iOnItemClickListener.onItemClick(item.getId());
            }
        });
    }

    public void setOnItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }

    @Override
    public int getItemCount() {
        return realWeddingItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgRealWedding)
        ImageView imgRealWedding;

        @BindView(R.id.tvTitle)
        TextView tvTitle;

        @BindView(R.id.tvDescription)
        TextView tvDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
