package com.example.android.moviedbapplication.root;

import com.example.android.moviedbapplication.data.MovieRepository;
import com.example.android.moviedbapplication.interfaces.MoviesActivityContract;
import com.example.android.moviedbapplication.interfaces.Repository;
import com.example.android.moviedbapplication.models.listing.MoviesModel;
import com.example.android.moviedbapplication.presenters.MovieListingPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public abstract class MovieListingModule {

    @Binds
    abstract MoviesActivityContract.Presenter bindPresenter(MovieListingPresenter presenter);

    @Binds
    abstract MoviesActivityContract.Model bindModel(MoviesModel model);

    @Provides
    static Repository provideRepository(Retrofit retrofit, MoviesDatabase database) {
        return new MovieRepository(retrofit, database);
    }
}
