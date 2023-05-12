package com.example.weddingplanner.ui.more;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weddingplanner.AboutActivity;
import com.example.weddingplanner.CreateWeddingActivity;
import com.example.weddingplanner.JoinWeddingActivity;
import com.example.weddingplanner.ProfileActivity;
import com.example.weddingplanner.WriteReviewActivity;
import com.example.weddingplanner.listener.IOnItemClickListener;
import com.example.weddingplanner.MoreMenuViewModel;
import com.example.weddingplanner.R;
import com.example.weddingplanner.adapter.MoreMenuAdapter;
import com.example.weddingplanner.pojo.MoreMenuItem;
import com.example.weddingplanner.ui.viewOrders.ViewOrdersActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoreMenuFragment extends Fragment {

    @BindView(R.id.moreMenuRecyclerView)
    RecyclerView moreMenuRecyclerView;

    private MoreMenuViewModel mViewModel;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MoreMenuViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more_menu, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel.getMoreMenuList().observe(getViewLifecycleOwner(), new Observer<ArrayList<MoreMenuItem>>() {
            @Override
            public void onChanged(ArrayList<MoreMenuItem> moreMenuItems) {
                setUpAdapter(moreMenuItems);
            }
        });

    }

    private void setUpAdapter(ArrayList<MoreMenuItem> moreMenuItems){
        MoreMenuAdapter adapter = new MoreMenuAdapter(moreMenuItems);
        moreMenuRecyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new IOnItemClickListener() {
            @Override
            public void onItemClick(int id) {
                if (id == 1){
                    Intent intent = new Intent(getActivity(), ProfileActivity.class);
                    startActivity(intent);
                } else if (id == 2) {
                    Intent intent = new Intent(getActivity(), ViewOrdersActivity.class);
                    startActivity(intent);
                } else if (id == 3) {
                    Intent intent = new Intent(getActivity(), JoinWeddingActivity.class);
                    startActivity(intent);
                } else if (id == 4) {
                    Intent intent = new Intent(getActivity(), CreateWeddingActivity.class);
                    startActivity(intent);
                } else if (id == 5) {
                    Intent intent = new Intent(getActivity(), WriteReviewActivity.class);
                    startActivity(intent);
                } else if (id == 6) {
                    Intent intent = new Intent(getActivity(), AboutActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
