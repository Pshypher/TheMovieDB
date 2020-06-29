package com.example.android.moviedbapplication.interfaces;

import com.example.android.moviedbapplication.models.listing.ViewModel;

import io.reactivex.Observable;


public interface MoviesActivityContract {

    interface View {
        void updateData(ViewModel viewModel);
        void showErrorMessage();
        void hideProgressBar();
    }

    interface Presenter {
        void setView(MoviesActivityContract.View view);
        void fetchMovies();
        void recyclerViewItemClicked(ViewModel viewModel);
    }

    interface Model {
        Observable<ViewModel> results();
    }
}
