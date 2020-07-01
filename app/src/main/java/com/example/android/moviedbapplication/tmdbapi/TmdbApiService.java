package com.example.android.moviedbapplication.tmdbapi;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TmdbApiService {

    @GET("movie/{path}")
    Observable<Response> getMovies(@Path("path") String path);
}