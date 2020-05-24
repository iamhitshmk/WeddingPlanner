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
import com.example.weddingplanner.pojo.ArticlesItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {

    private ArrayList<ArticlesItem> articlesItems;
    private IOnItemClickListener iOnItemClickListener;

    public ArticlesAdapter(ArrayList<ArticlesItem> articlesItems) {
        this.articlesItems = articlesItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_article_item, parent, false);

        return new ArticlesAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ArticlesItem item = articlesItems.get(position);
        holder.imgArticle.setImageResource(item.getArticleImage());
        holder.tvTitle.setText(item.getTitle());
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
        return articlesItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imgArticle)
        ImageView imgArticle;

        @BindView(R.id.tvTitle)
        TextView tvTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
