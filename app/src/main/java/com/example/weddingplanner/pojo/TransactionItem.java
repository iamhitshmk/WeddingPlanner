package com.example.weddingplanner.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class TransactionItem implements Parcelable {

    public TransactionItem(String orderId, ArrayList<PlaceOrderItem> items) {
        this.orderId = orderId;
        this.items = items;
    }

    public TransactionItem() {
    }

    String orderId;

    protected TransactionItem(Parcel in) {
        orderId = in.readString();
        items = in.createTypedArrayList(PlaceOrderItem.CREATOR);
    }

    public static final Creator<TransactionItem> CREATOR = new Creator<TransactionItem>() {
        @Override
        public TransactionItem createFromParcel(Parcel in) {
            return new TransactionItem(in);
        }

        @Override
        public TransactionItem[] newArray(int size) {
            return new TransactionItem[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(orderId);
        dest.writeTypedList(items);
    }
}
