package com.example.android.moviedbapplication.data;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Movie {

    @PrimaryKey
    private long movieId;

    @ColumnInfo(name="movie_title")
    private String title;

    @ColumnInfo(name="poster_path")
    private String posterPath;

    @ColumnInfo(name="movie_category")
    private String category;

    @Nullable
    @ColumnInfo(name = "release_date")
    private String releaseDate;

    public Movie(long movieId, String title, String category) {
        this.movieId = movieId;
        this.title = title;
        this.category = category;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Nullable
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(@Nullable String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
