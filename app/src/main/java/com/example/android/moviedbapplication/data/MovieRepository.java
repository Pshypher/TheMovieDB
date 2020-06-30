package com.example.android.moviedbapplication.data;

import android.util.Log;

import com.example.android.moviedbapplication.interfaces.Categorizable;
import com.example.android.moviedbapplication.tmdbapi.TmdbApiService;
import com.example.android.moviedbapplication.interfaces.Repository;
import com.example.android.moviedbapplication.root.MoviesDatabase;
import com.example.android.moviedbapplication.utilities.NetworkParsingUtils;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Retrofit;

public class MovieRepository implements Repository {

    private MoviesDatabase database;
    private TmdbApiService service;
    private List<Movie> results;

    private static final String TAG = "MovieRepository";

    @Inject
    public MovieRepository(Retrofit retrofit, MoviesDatabase database) {
        this.database = database;
        service = retrofit.create(TmdbApiService.class);
        results = new ArrayList<Movie>();
    }


    @Override
    public Observable<Movie> queryLocalRepository() {
        if (!results.isEmpty()) {
            return Observable.fromIterable(results);
        } else {
            return fetchFromDB();
        }
    }

    private Observable<Movie> fetchFromDB() {
        MovieDao dao = database.movieDao();
        Observable<List<Movie>> listObservable = dao.getMovies();
        return listObservable.flatMap(Observable::fromIterable)
                .doOnNext(movie -> results.add(movie));
    }

    public Observable<Movie> queryRemoteRepository() {

        Observable<String> requestsObservable = Observable.just(
                "popular",
                "upcoming",
                "top_rated"
        );

        Observable<Categorizable> responseObservable = requestsObservable.flatMap(service::getMovies);

        return responseObservable
                .map(NetworkParsingUtils::parse)
                .flatMap(Observable::fromIterable)
                .doOnNext(movie -> {
                    Log.d(TAG, "queryRemoteRepository: " + movie);
                    storeResultsInDB(movie);
                });
    }

    private void storeResultsInDB(Movie m) {
        MovieDao dao = database.movieDao();
        dao.insert(m).doOnSuccess(id -> Log.d(TAG, "row id: " + id));
    }

    @Override
    public Observable<Movie> getMovies() {
        return queryLocalRepository().switchIfEmpty(queryRemoteRepository());
    }
}
