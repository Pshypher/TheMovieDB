package com.example.android.moviedbapplication.data;

import androidx.room.Dao;
import androidx.room.Insert;

import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.Observable;

@Dao
public interface MovieDao {

    @Query("SELECT * FROM movie")
    Observable<List<Movie>> getMovies();

    @Transaction
    @Query("SELECT * FROM Movie")
    Observable<List<MovieWithGenres>> getMovieWithGenres();

    @Transaction
    @Query("SELECT * FROM Movie")
    Observable<List<MovieWithCompanies>> getMovieWithCompanies();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    Maybe<Long> insert(Movie movie);
}
