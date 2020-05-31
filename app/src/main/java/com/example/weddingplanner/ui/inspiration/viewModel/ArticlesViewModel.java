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
        listOfItems.add(new ArticlesItem(4,R.drawable.ic_article_4,"Questions You Should be Asking To Vendors During The Coronavirus Pandemic"));
        listOfItems.add(new ArticlesItem(5,R.drawable.ic_article_5,"Wedding Planner Reveals:Effect Of Coronavirus on Destination Weddings"));
        listOfItems.add(new ArticlesItem(6,R.drawable.ic_article_6,"5 Colour Schemes Perfect For Your Upcoming Summer Wedding Or Mehendi"));
        listOfItems.add(new ArticlesItem(7,R.drawable.ic_article_7,"This Beautiful Mehendi & Haldi Had The Cutest Ideas And Favours"));
        listOfItems.add(new ArticlesItem(8,R.drawable.ic_article_8,"Best Telugu Marriage Dates in 2020"));
        listOfItems.add(new ArticlesItem(9,R.drawable.ic_article_9,"Talambralu Shots We Fell in Love With"));
        listOfItems.add(new ArticlesItem(10,R.drawable.ic_article_10,"This Couple had Rain Dance Party With Some Amazing Ideas"));
        listOfItems.add(new ArticlesItem(11,R.drawable.ic_article_11,"A Magical Wedding With A HeartWarming Story"));
        listOfItems.add(new ArticlesItem(12,R.drawable.ic_article_12,"Unique Back Hand Mehendi Designs For the Bridesmaids "));
        listOfItems.add(new ArticlesItem(13,R.drawable.ic_article_13,"Ideas On What To Wear For An Intimate Wedding"));
        listOfItems.add(new ArticlesItem(14,R.drawable.ic_article_14,"Wedding Cakes That Had Unique Personalised items!"));
        listOfItems.add(new ArticlesItem(15,R.drawable.ic_article_15,"These Childhood Friends Got Married & It's The Most Heart-Warming Experience"));
        listOfItems.add(new ArticlesItem(16,R.drawable.ic_article_16,"Groom Is Going Ahead To Toe Monotone With Their Sherwanis,& We Like It!"));
        listOfItems.add(new ArticlesItem(17,R.drawable.ic_article_17,"A Vibrant Kolkata Beach Wedding With Vivid Decor and Outfits"));
        listOfItems.add(new ArticlesItem(18,R.drawable.ic_article_18,"Sisters Of The Bride Style"));
        listOfItems.add(new ArticlesItem(19,R.drawable.ic_article_19,"Move Over Mandaps,Trees Are Taking Over Your Wedding Decor!"));
        listOfItems.add(new ArticlesItem(20,R.drawable.ic_article_20,"Is Your Hand Sanitizer Bad For Your Engagement  Ring?"));
        listOfItems.add(new ArticlesItem(21,R.drawable.ic_article_21,"Shubha Muhurtham Dates For 2021 As Per Telugu Calendar"));

        articleList.setValue(listOfItems);
    }

    public LiveData<ArrayList<ArticlesItem>> getArticlesList() {
        return articleList;
    }


}
