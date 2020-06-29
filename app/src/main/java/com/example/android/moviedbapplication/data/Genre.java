package com.example.android.moviedbapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Genre {

    @PrimaryKey
    private long genreId;

    @ColumnInfo(name = "genre")
    private String name;

    public Genre(long genreId, String name) {
        this.genreId = genreId;
        this.name = name;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
