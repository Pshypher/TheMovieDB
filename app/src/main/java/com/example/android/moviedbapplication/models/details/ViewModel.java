package com.example.android.moviedbapplication.models.details;

import com.example.android.moviedbapplication.data.ProductionCompany;

import java.util.List;

public class ViewModel {

    private int mId;
    private String mImageUri;
    private String mTitle;
    private List<String> mGenres;
    private String mSynopsis;
    private List<ProductionCompany> mCompanies;

    public ViewModel(int mId, String mTitle, List<String> mGenres, String mSynopsis,
                     List<ProductionCompany> mCompanies) {
        this.mId = mId;
        this.mTitle = mTitle;
        this.mGenres = mGenres;
        this.mSynopsis = mSynopsis;
        this.mCompanies = mCompanies;
    }

    public ViewModel(int mId, String mImageUri, String mTitle, List<String> mGenres, String mSynopsis,
                     List<ProductionCompany> mCompanies) {
        this.mId = mId;
        this.mImageUri = mImageUri;
        this.mTitle = mTitle;
        this.mGenres = mGenres;
        this.mSynopsis = mSynopsis;
        this.mCompanies = mCompanies;
    }

    public int getId() {
        return mId;
    }

    public void setmId(int id) {
        this.mId = id;
    }

    public String getImageUri() {
        return mImageUri;
    }

    public void setImageUri(String imageUri) {
        this.mImageUri = imageUri;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setmTitle(String title) {
        this.mTitle = title;
    }

    public List<String> getGenres() {
        return mGenres;
    }

    public void setGenres(List<String> genres) {
        this.mGenres = genres;
    }

    public String getSynopsis() {
        return mSynopsis;
    }

    public void setSynopsis(String synopsis) {
        this.mSynopsis = synopsis;
    }

    public List<ProductionCompany> getCompanies() {
        return mCompanies;
    }

    public void setCompanies(List<ProductionCompany> companies) {
        this.mCompanies = companies;
    }
}
