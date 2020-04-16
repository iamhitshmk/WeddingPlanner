package com.example.weddingplanner.pojo;

public class ArticlesItem {

    public int getArticleImage() {
        return articleImage;
    }

    public String getTitle() {
        return title;
    }

    private int articleImage;

    public ArticlesItem(int articleImage, String title) {
        this.articleImage = articleImage;
        this.title = title;
    }

    private String title;
}
