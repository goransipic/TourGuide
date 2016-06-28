package com.example.android.tourguide.models;

/**
 * Created by goransi on 28.6.2016..
 */
public class Accommodation {

    private String mTitle;
    private String mSubtitle;

    private int resIdImage;

    public Accommodation(String mTitle, String mSubtitle, int resIdImage) {
        this.mTitle = mTitle;
        this.mSubtitle = mSubtitle;
        this.resIdImage = resIdImage;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getSubtitle() {
        return mSubtitle;
    }

    public void setSubtitle(String mSubtitle) {
        this.mSubtitle = mSubtitle;
    }

    public int getResIdImage() {
        return resIdImage;
    }

    public void setResIdImage(int resIdImage) {
        this.resIdImage = resIdImage;
    }

}
