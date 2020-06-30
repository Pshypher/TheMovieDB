package com.example.android.moviedbapplication.tmdbapi;

import com.example.android.moviedbapplication.interfaces.Categorizable;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TmdbApiService {

    @GET("movie/{path}")
    Observable<Categorizable> getMovies(@Path("path") String path);
}