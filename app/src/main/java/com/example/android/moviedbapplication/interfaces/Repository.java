package com.example.android.moviedbapplication.interfaces;

import com.example.android.moviedbapplication.data.Movie;

import io.reactivex.Observable;

public interface Repository {
    Observable<Movie> queryLocalRepository();
    Observable<Movie> queryRemoteRepository();
    Observable<Movie> getMovies();
}
