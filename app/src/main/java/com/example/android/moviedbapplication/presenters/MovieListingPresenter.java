package com.example.android.moviedbapplication.presenters;


import androidx.annotation.Nullable;

import com.example.android.moviedbapplication.interfaces.MoviesActivityContract;
import com.example.android.moviedbapplication.models.listing.ViewModel;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class MovieListingPresenter implements MoviesActivityContract.Presenter {

    @Nullable private MoviesActivityContract.View mMovieListingActivity;
    private Disposable disposable = null;
    private MoviesActivityContract.Model mModel;

    @Inject
    public MovieListingPresenter(MoviesActivityContract.Model model) {
        this.mModel = model;
    }

    @Override
    public void setView(MoviesActivityContract.View activity) {
        mMovieListingActivity = activity;
    }

    @Override
    public void fetchMovies() {
        if (mMovieListingActivity != null) {
            loadData();
        }

    }

    private void loadData() {
        assert mMovieListingActivity != null;
        disposable = mModel.results()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mMovieListingActivity::updateData);
    }

    @Override
    public void recyclerViewItemClicked(ViewModel viewModel) {

    }
}
