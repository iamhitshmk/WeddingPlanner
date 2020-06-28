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
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_one,"Celejor","4.5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_two,"Chocolate Hall","4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_three,"Dcakes creation","4.7","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_four,"Dutch Palace","4.2","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_five,"Ferns N Petals","4.4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_six,"Luscious Bakers","4.7","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_seven,"Oven Fresh","4.9","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCardsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_one,"AA Enterprises","4.8","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_two,"Flying Elephant Designs","4.7","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_three,"Itchha Talreja Designs","3.9","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_four,"Les Works","5","4.4","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cards_five,"Studio Works Co","4.6","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_cakes_six,"The Papier Project","4.7","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingCateringData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_one,"Ekveera catering","4.8","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_two,"Hema Catering","4.2","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_three,"Khasiyat","4.4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_four,"Malhotra","4.6","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_five,"Pratap","4.2","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_catering_six,"Sai catering","4.7","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingDecoratorsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_one,"f5 wedding","4.8","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_two,"National decorations","4.4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_three,"RV Event Entertain","4.6","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_four,"The Wedding Soul","4.7","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_five,"Smile events and weddings","4.8","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_six,"Uours events planer and decor","4.4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_decorators_seven,"Wedding ties","4.2","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingDJData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_one,"Dj Blast Audio Sound","4.8","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_two,"DJ Cassino","4.4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_three,"DJ Nash, Wadala","4.2","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_four,"DJ Sound","3.6","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_five,"Sound Impulse by Amit, Versova","4.0","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_dj_six,"Volcano Sounds","4.2","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingMehendiData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_one,"Aksha Shah Mehendi Designer","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_two,"Hari Om","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_three,"Harin's Mehndi","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_four,"Kapil mehandi artist","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_five,"Pari Beauty Studio","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_six,"Rahul mehandi artist","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_mehendi_seven,"Rohan mehndi artist","5","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingPanditsData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_one,"Acharya Sugriv Prasad Tiwari Jyotish Services","4.4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_two,"Ashish Kumar DUbey","4.2","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_three,"Dinesh Dave","4.4","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_four,"Pandit Shaligram Gautam","4.3","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_five,"Radhe Krishna Jyotish Kendra","4.5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_six,"Shastri Sunil Dubey","4.6","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_pandits_seven,"Shree Saiprasad Kulkarni Guruji","4.4","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingPhotographersData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_one,"Blu Swan Media","4.9","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_two,"Divyesh Harchekar Photography","4.8","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_three,"Fantasy Filmer","4.7","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_four,"Marshmallow Studios","4.6","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_five,"MVB PRoDUCTION","4.2","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_six,"Peppermint Pictures","4.1","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_photographers_seven,"THE MEMORY CAPTURE","4.1","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingVenuesData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_one,"AnnaSaheb Vartak Hall","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_two,"Ileafritz","4.8","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_three,"Kiaraa Banquet","4.9","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_four,"AnnaSaheb Vartak Hall","4.0","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_five,"AnnaSaheb Vartak Hall","5.0","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_venue_six,"AnnaSaheb Vartak Hall","4.4","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }

    LiveData<ArrayList<VendorListDetailItem>> getWeddingMakeupData(){
        listDetailItems.clear();
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_one,"Bridal Makeup Artist Kriti B","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_two,"Farah Charna Hair & Makeup","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_three,"Glamup by Sonali","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_four,"Hiya Makeup Studio","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_five,"Image Maker Makeup & Hair Academy","5","2","Mumbai","1000","Add Description"));
        listDetailItems.add(new VendorListDetailItem(R.drawable.ic_wedding_makeup_six,"Namita Makeover","5","2","Mumbai","1000","Add Description"));
        list.setValue(listDetailItems);
        return list;
    }
}
