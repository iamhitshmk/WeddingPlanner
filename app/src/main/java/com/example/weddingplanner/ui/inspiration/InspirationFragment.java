package com.example.weddingplanner.ui.inspiration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.ViewPagerAdapter;
import com.example.weddingplanner.ui.inspiration.fragments.ArticlesFragment;
import com.example.weddingplanner.ui.inspiration.fragments.PhotosFragment;
import com.example.weddingplanner.ui.inspiration.fragments.RealWeddingsFragment;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InspirationFragment extends Fragment {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;


    @BindView(R.id.viewPager)
    ViewPager viewPager;

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View view = inflater.inflate(R.layout.fragment_inspiration, container, false);
        ButterKnife.bind(this,view);
        return view;

        /*homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViewPagerAdapter();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPagerAdapter() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PhotosFragment(),"Photos");
        adapter.addFragment(new RealWeddingsFragment(), "Real Weddings");
        adapter.addFragment(new ArticlesFragment(), "Articles");
        viewPager.setAdapter(adapter);
    }
}