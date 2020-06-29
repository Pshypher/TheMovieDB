package com.example.android.moviedbapplication.data;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class MovieWithCompanies {
    @Embedded public Movie movie;
    @Relation(
            parentColumn = "movieId",
            entityColumn = "companyId",
            associateBy = @Junction(MovieProductionCompanyCrossRef.class)
    )
    public List<ProductionCompany> companies;
}
