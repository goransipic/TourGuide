package com.example.android.tourguide.models;

/**
 * Created by goransi on 28.6.2016..
 */
public class Institution {

    private String mTitle;
    private String mSubtitle;

    public Institution(String mTitle, String mSubtitle) {
        this.mTitle = mTitle;
        this.mSubtitle = mSubtitle;

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

}
