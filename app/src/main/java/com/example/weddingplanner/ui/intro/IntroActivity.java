package com.example.weddingplanner.ui.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weddingplanner.ui.login.LoginActivity;
import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.IntroAdapter;
import com.example.weddingplanner.pojo.IntroItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

public class IntroActivity extends AppCompatActivity {

    @BindView(R.id.introRecyclerView)
    RecyclerView introRecyclerView;

    @BindView(R.id.introIndicator)
    ScrollingPagerIndicator introIndicator;

    @BindView(R.id.tvClose)
    TextView tvClose;

    private IntroViewModel introViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ButterKnife.bind(this);
        introViewModel = ViewModelProviders.of(this).get(IntroViewModel.class);
        observeCommands();
        introViewModel.getIntroList();
        initOnClicks();
    }

    private void observeCommands(){
        introViewModel.getIntroList().observe(this, new Observer<ArrayList<IntroItem>>() {
            @Override
            public void onChanged(ArrayList<IntroItem> introItems) {
                setUpAdapter(introItems);
            }
        });
    }

    private void setUpAdapter(ArrayList<IntroItem> introItems){
        IntroAdapter adapter = new IntroAdapter(introItems);
        introRecyclerView.setAdapter(adapter);
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        introRecyclerView.setOnFlingListener(null);
        snapHelper.attachToRecyclerView(introRecyclerView);
        introIndicator.attachToRecyclerView(introRecyclerView);

    }

    private void initOnClicks(){
        tvClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
