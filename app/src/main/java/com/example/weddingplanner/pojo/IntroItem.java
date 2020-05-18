package com.example.weddingplanner.pojo;

public class IntroItem {

    public int getIntroImage() {
        return introImage;
    }

    public String getIntroText() {
        return introText;
    }

    private int introImage;

    public IntroItem(int introImage, String introText) {
        this.introImage = introImage;
        this.introText = introText;
    }

    private String introText;
}
