package com.myfirst.youtubelistapp;

public class YoutubeModel {
    private int thumbnail;
    private int title;
    private String link;

    public YoutubeModel(int thumbnail, int title, String link) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.link = link;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public int getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }
}
