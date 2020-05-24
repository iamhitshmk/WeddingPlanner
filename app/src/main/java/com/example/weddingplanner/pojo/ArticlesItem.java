package com.example.weddingplanner.pojo;

public class ArticlesItem {

    public int getArticleImage() {
        return articleImage;
    }

    public String getTitle() {
        return title;
    }

    private int articleImage;
    private String title;
    public ArticlesItem(int id, int articleImage, String title) {
        this.id = id;
        this.articleImage = articleImage;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    private int id;
}

