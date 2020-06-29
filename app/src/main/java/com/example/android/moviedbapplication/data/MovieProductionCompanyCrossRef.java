package com.example.android.moviedbapplication.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"movieId", "companyId"})
public class MovieProductionCompanyCrossRef {
    public long movieId;
    @ColumnInfo(index = true)
    public long companyId;
}
