package com.example.android.moviedbapplication.models.listing;

import com.example.android.moviedbapplication.interfaces.MoviesActivityContract;
import com.example.android.moviedbapplication.interfaces.Repository;

import javax.inject.Inject;

import io.reactivex.Observable;

public class MoviesModel implements MoviesActivityContract.Model {

    private Repository repository;

    @Inject
    public MoviesModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> results() {
        return repository.getMovies()
                .map(movie ->
                        new ViewModel(movie.getTitle(), movie.getCategory()));
    }

}
