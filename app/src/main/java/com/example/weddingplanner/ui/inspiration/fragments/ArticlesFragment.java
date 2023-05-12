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

import com.example.weddingplanner.ArticleDetailActivity;
import com.example.weddingplanner.listener.IOnItemClickListener;
import com.example.weddingplanner.PhotoDetailActivity;
import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.ArticlesAdapter;
import com.example.weddingplanner.pojo.ArticlesItem;
import com.example.weddingplanner.ui.inspiration.viewModel.ArticlesViewModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ArticlesFragment extends Fragment {

    @BindView(R.id.articlesRecyclerView)
    RecyclerView articlesRecyclerView;

    private ArticlesViewModel articlesViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        articlesViewModel = ViewModelProviders.of(this).get(ArticlesViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_articles, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        articlesViewModel.getArticlesList().observe(getViewLifecycleOwner(), new Observer<ArrayList<ArticlesItem>>() {
            @Override
            public void onChanged(ArrayList<ArticlesItem> articlesItems) {
                setUpAdapter(articlesItems);
            }
        });
    }

    private void setUpAdapter(ArrayList<ArticlesItem> articlesItems){
        ArticlesAdapter adapter = new ArticlesAdapter(articlesItems);
        articlesRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new IOnItemClickListener() {
            @Override
            public void onItemClick(int id) {
                Intent intent = new Intent(getActivity(), ArticleDetailActivity.class);
                intent.putExtra("screen","article");
                intent.putExtra("id",id);
                startActivity(intent);
            }
        });
    }
}
