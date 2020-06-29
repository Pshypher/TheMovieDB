package com.example.android.moviedbapplication.root;

import android.content.Context;
import android.util.Log;

import androidx.room.Room;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MoviesDatabaseModule {

    private static final String TAG = "MoviesDatabaseModule";

    @Provides
    @Singleton
    public MoviesDatabase provideDatabase(Context ctxt) {
        return Room.databaseBuilder(ctxt,
                MoviesDatabase.class, "movie_database").build();
    }
}
