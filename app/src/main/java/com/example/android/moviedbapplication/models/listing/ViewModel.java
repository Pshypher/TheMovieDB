package com.example.android.moviedbapplication.models.listing;

public class ViewModel {

    private String mTitle;
    private String mCategory;

    public ViewModel(String title, String category) {
        mTitle = title;
        mCategory = category;
    }
    public String getName() {
        return mTitle;
    }

    public void setName(String title) {
        mTitle = title;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }
}
