package com.example.weddingplanner.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.IntroItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IntroAdapter extends RecyclerView.Adapter<IntroAdapter.ViewHolder> {

    private ArrayList<IntroItem> introItems;
    public IntroAdapter(ArrayList<IntroItem> introItems) {
        this.introItems = introItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_intro_item, parent, false);

        return new IntroAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        IntroItem item = introItems.get(position);
        holder.introImage.setImageResource(item.getIntroImage());
        holder.tvIntroText.setText(item.getIntroText());
    }

    @Override
    public int getItemCount() {
        return introItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.introImage)
        ImageView introImage;

        @BindView(R.id.tvIntroText)
        TextView tvIntroText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
