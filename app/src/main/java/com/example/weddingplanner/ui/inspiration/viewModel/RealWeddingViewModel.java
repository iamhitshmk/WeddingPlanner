package com.example.weddingplanner.ui.inspiration.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.RealWeddingItem;

import java.util.ArrayList;

public class RealWeddingViewModel extends ViewModel {

    private MutableLiveData<ArrayList<RealWeddingItem>> realWeddingList;

    public RealWeddingViewModel() {
        realWeddingList = new MutableLiveData<>();
        ArrayList<RealWeddingItem> listOfItems = new ArrayList<>();
        listOfItems.add(new RealWeddingItem(1,R.drawable.ic_rw_aman_niti,"Aman & Nitish","Pretty Wedding With A Sky Blue Bridal Lehenga "));
        listOfItems.add(new RealWeddingItem(2,R.drawable.ic_rw_ashritha_yashwant,"Ashritha & Yashwant","Beautiful Wedding With A bride in Offbeat Outfits"));
        listOfItems.add(new RealWeddingItem(3,R.drawable.ic_rw_palak_chirag,"Chirag & Palak","A Gorgeous Wedding With A Charming Couple "));
        listOfItems.add(new RealWeddingItem(4,R.drawable.ic_rw_prachi_mohit,"Mohit & Prachi","A Royal Wedding With A Dreamy Proposal"));
        listOfItems.add(new RealWeddingItem(5,R.drawable.ic_rw_shailesh_divya,"Shailesh & Divya","Elegant Wedding With A Refreshing Mehendi Look"));
        listOfItems.add(new RealWeddingItem(6,R.drawable.ic_rw_shekhar_madhuri,"Shekhar & Madhuri","A Pastel Wedding With An Offbeat Bridal Outfit"));
        listOfItems.add(new RealWeddingItem(7,R.drawable.ic_rw_shivali_abhijeet,"Abhijeet & Shivali","Traditional wedding With The Bride In A Bright Kanjeevaram"));
        listOfItems.add(new RealWeddingItem(8,R.drawable.ic_rw_sonal_akash,"Akash & Sonal","A Sustainable Wedding With Eco-Friendly Measures"));
        listOfItems.add(new RealWeddingItem(9,R.drawable.ic_rw_sumaan_ishaan,"Ishaan & Sumaan","Stunning Wedding With An Offbeat Bridal Lehenga"));
        listOfItems.add(new RealWeddingItem(10,R.drawable.ic_rw_swati_kamlesh,"Kamlesh & Swati","Glam Engagement With A Bride In A White Gown "));
        realWeddingList.setValue(listOfItems);
    }

    public LiveData<ArrayList<RealWeddingItem>> getRealWeddingList() {
        return realWeddingList;
    }

}
