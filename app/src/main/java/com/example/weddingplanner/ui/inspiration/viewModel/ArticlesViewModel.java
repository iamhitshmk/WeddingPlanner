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
        listOfItems.add(new ArticlesItem(1,R.drawable.ic_article_1,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(2,R.drawable.ic_article_2,"The Idea Of A Food Bar At weddings Is Really Fresh!"));
        listOfItems.add(new ArticlesItem(3,R.drawable.ic_article_3,"Trending Colour Palettes And Designs For Wedding Invitations"));
        listOfItems.add(new ArticlesItem(4,R.drawable.ic_article_4,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(5,R.drawable.ic_article_5,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(6,R.drawable.ic_article_6,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(7,R.drawable.ic_article_7,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(8,R.drawable.ic_article_8,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(9,R.drawable.ic_article_9,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(10,R.drawable.ic_article_10,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(11,R.drawable.ic_article_11,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(12,R.drawable.ic_article_12,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(13,R.drawable.ic_article_13,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(14,R.drawable.ic_article_14,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(15,R.drawable.ic_article_15,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(16,R.drawable.ic_article_16,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(17,R.drawable.ic_article_17,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(18,R.drawable.ic_article_18,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(19,R.drawable.ic_article_19,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(20,R.drawable.ic_article_20,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        listOfItems.add(new ArticlesItem(21,R.drawable.ic_article_21,"Boat Neck Blouse Designs We Are Totally Crushing On!"));
        articleList.setValue(listOfItems);
    }

    public LiveData<ArrayList<ArticlesItem>> getArticlesList() {
        return articleList;
    }


}
