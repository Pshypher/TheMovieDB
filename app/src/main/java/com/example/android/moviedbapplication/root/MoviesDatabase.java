package com.example.android.moviedbapplication.root;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.android.moviedbapplication.data.Genre;
import com.example.android.moviedbapplication.data.Movie;
import com.example.android.moviedbapplication.data.MovieDao;
import com.example.android.moviedbapplication.data.MovieGenreCrossRef;
import com.example.android.moviedbapplication.data.MovieProductionCompanyCrossRef;
import com.example.android.moviedbapplication.data.ProductionCompany;

@Database(entities = {Movie.class, Genre.class, ProductionCompany.class,
        MovieGenreCrossRef.class, MovieProductionCompanyCrossRef.class,},
        version = 1, exportSchema = false)
public abstract class MoviesDatabase extends RoomDatabase {
    public abstract MovieDao movieDao();
}
