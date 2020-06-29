package com.example.android.moviedbapplication.utilities;

import com.example.android.moviedbapplication.data.Movie;
import com.example.android.moviedbapplication.tmdbapi.popular.Popular;
import com.example.android.moviedbapplication.tmdbapi.toprated.TopRated;
import com.example.android.moviedbapplication.tmdbapi.upcoming.Upcoming;

import java.util.List;

public class NetworkParsingUtils {

    private NetworkParsingUtils() {

    }

    public static List<Movie> parse(Object response) {
        List<Movie> movies;
        if (response instanceof Popular) {
            movies = ((Popular) response).parse();
        } else if (response instanceof TopRated) {
            movies = ((TopRated) response).parse();
        } else if (response instanceof Upcoming) {
            movies = ((Upcoming) response).parse();
        } else {
            throw new IllegalArgumentException("Unknown category: " + response);
        }

        return movies;
    }
}
