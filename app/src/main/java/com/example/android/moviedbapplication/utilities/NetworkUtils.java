package com.example.android.moviedbapplication.utilities;

import com.example.android.moviedbapplication.data.Movie;
import com.example.android.moviedbapplication.tmdbapi.Response;
import com.example.android.moviedbapplication.tmdbapi.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NetworkUtils {

    private NetworkUtils() {

    }

    public static List<Movie> parse(HashMap<String, Response> map) {
        List<Movie> movies = new ArrayList<>();
        for (String key : map.keySet()) {
            Response response = map.get(key);
            List<Result> results = response.getResults();
            for (Result r : results) {
                long id = r.getId();
                String title = r.getTitle();
                movies.add(new Movie(id, title, key));
            }
        }

        return movies;
    }

    public static HashMap<String, Response> tag(String category, Response res) {
        HashMap map = new HashMap<String, Response>();
        map.put(category, res);
        return map;
    }
}
