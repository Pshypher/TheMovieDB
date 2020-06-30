package com.example.android.moviedbapplication.interfaces;

import com.example.android.moviedbapplication.tmdbapi.Result;

import java.util.List;

public interface Categorizable {

    List<Result> getResults();
}
