package com.example.weddingplanner.ui.vendor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.VendorItem;
import com.example.weddingplanner.pojo.VendorListDetailItem;

import java.util.ArrayList;

public class VendorListDetailsViewModel extends ViewModel {

    private MutableLiveData<ArrayList<VendorListDetailItem>> list;
    private ArrayList<VendorListDetailItem> listDetailItems;

    public VendorListDetailsViewModel(){
        list = new MutableLiveData<>();
        listDetailItems = new ArrayList<>();
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCakesData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCardsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCateringData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingDecoratorsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingDJData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingMehendiData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingPanditsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingPhotographersData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingVenuesData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingMakeupData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000"));
        list.setValue(listDetailItems);
        return list;
    }
}
