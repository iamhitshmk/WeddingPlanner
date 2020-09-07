package com.example.weddingplanner.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weddingplanner.R;
import com.example.weddingplanner.listener.IOnInboxItemListener;
import com.example.weddingplanner.listener.IOnItemClickListener;
import com.example.weddingplanner.pojo.PlaceOrderItem;
import com.example.weddingplanner.pojo.TransactionItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewOrdersAdapter extends RecyclerView.Adapter<ViewOrdersAdapter.ViewHolder>{

    ArrayList<TransactionItem> viewOrders;
    private IOnInboxItemListener iOnItemClickListener;

    public ViewOrdersAdapter(ArrayList<TransactionItem> viewOrders) {
        this.viewOrders = viewOrders;
    }

    public void setOnItemClickListener(IOnInboxItemListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_inbox_items, parent, false);

        return new ViewHolder(itemView);
}

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TransactionItem item = viewOrders.get(position);
        holder.tvOrderId.setText("Transaction ID : "+item.getOrderId());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iOnItemClickListener != null){
                    iOnItemClickListener.onItemClick(item);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return viewOrders.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


       @BindView(R.id.tv_orderid)
        TextView tvOrderId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
