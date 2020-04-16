package com.example.weddingplanner.ui.inspiration.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.weddingplanner.R;
import com.example.weddingplanner.pojo.ArticlesItem;

import java.util.ArrayList;

public class ArticlesViewModel extends ViewModel {

    private MutableLiveData<ArrayList<ArticlesItem>> articleList;

    public ArticlesViewModel() {
        articleList = new MutableLiveData<>();
        ArrayList<ArticlesItem> listOfItems = new ArrayList<>();
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(R.drawable.ic_rw_shailesh_divya,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        articleList.setValue(listOfItems);
    }

    public LiveData<ArrayList<ArticlesItem>> getArticlesList() {
        return articleList;
    }


}
