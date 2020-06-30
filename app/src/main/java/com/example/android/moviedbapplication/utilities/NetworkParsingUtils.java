package com.example.android.moviedbapplication.utilities;

import com.example.android.moviedbapplication.data.Movie;
import com.example.android.moviedbapplication.interfaces.Categorizable;
import com.example.android.moviedbapplication.tmdbapi.Result;

import java.util.ArrayList;
import java.util.List;

public class NetworkParsingUtils {

    private NetworkParsingUtils() {

    }

    public static List<Movie> parse(Categorizable response) {
        List<Result> results = response.getResults();
        List<Movie> movies = new ArrayList<>();
        for (Result r : results) {
            String className = response.getClass().getName();
            Movie m = new Movie(r.getId(), r.getTitle(), className);
            movies.add(m);
        }

        return movies;
    }
}
