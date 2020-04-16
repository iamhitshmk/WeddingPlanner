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
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Aman & Nitish",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Ashritha & Yashwant",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Chirag & Palak",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Mohit & Prachi",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Shailesh & Divya",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Shekhar & Madhuri",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Abhijeet & Shivali",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Akash & Sonal",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Ishaan & Sumaan",""));
        listOfItems.add(new RealWeddingItem(R.drawable.ic_rw_shailesh_divya,"Kamlesh & Swati",""));
        realWeddingList.setValue(listOfItems);
    }

    public LiveData<ArrayList<RealWeddingItem>> getRealWeddingList() {
        return realWeddingList;
    }

}
