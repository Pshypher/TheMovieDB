package com.example.android.moviedbapplication.root;

import android.content.Context;

import com.example.android.moviedbapplication.activities.MovieListingActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {MovieListingModule.class, NetworkModule.class, MoviesDatabaseModule.class})
public interface ApplicationComponent {

    void inject(MovieListingActivity activity);

    Context getApplicationContext();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder applicationContext(Context context);

        ApplicationComponent build();
    }
}
