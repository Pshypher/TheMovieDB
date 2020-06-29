package com.example.android.moviedbapplication.data;

import androidx.annotation.Nullable;
import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class MovieWithGenres {
    @Embedded public Movie movie;
    @Relation(
            parentColumn = "movieId",
            entityColumn = "genreId",
            associateBy = @Junction(MovieGenreCrossRef.class)
    )
    public List<Genre> genres;
}
