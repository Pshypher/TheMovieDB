package com.example.android.moviedbapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"movieId", "genreId"})
public class MovieGenreCrossRef {
    public long movieId;
    @ColumnInfo(index = true)
    public long genreId;
}
