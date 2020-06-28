package com.example.weddingplanner.pojo;

import java.util.ArrayList;

public class TransactionItem {

    public TransactionItem(String orderId, ArrayList<PlaceOrderItem> items) {
        this.orderId = orderId;
        this.items = items;
    }

    public TransactionItem() {
    }

    String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ArrayList<PlaceOrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<PlaceOrderItem> items) {
        this.items = items;
    }

    ArrayList<PlaceOrderItem> items;
}
