package com.example.android.moviedbapplication.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.android.moviedbapplication.interfaces.MoviesActivityContract;
import com.example.android.moviedbapplication.models.listing.ViewModel;
import com.example.android.moviedbapplication.root.MoviesApplication;
import com.example.android.moviedbapplication.R;
import com.example.android.moviedbapplication.root.ApplicationComponent;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieListingActivity extends AppCompatActivity implements MoviesActivityContract.View {

    @BindView(R.id.pb_upcoming_movies)
    ProgressBar upcomingMoviesProgressBar;

    @BindView(R.id.pb_top_rated)
    ProgressBar topRatedMoviesProgressBar;

    @BindView(R.id.pb_popular_movies)
    ProgressBar popularMoviesProgressBar;

    @BindView(R.id.rv_upcoming_movies)
    RecyclerView upcomingMoviesRecyclerView;

    @BindView(R.id.rv_top_rated)
    RecyclerView topRatedMoviesRecyclerView;

    @BindView(R.id.rv_popular_movies)
    RecyclerView popularMoviesRecyclerView;

    @Inject MoviesActivityContract.Presenter presenter;

    private List<ViewModel> mViewModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_listing);

        ApplicationComponent component = ((MoviesApplication) getApplication()).getComponent();
        component.inject(this);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.fetchMovies();
    }

    @Override
    public void updateData(ViewModel viewModel) {
        mViewModels.add(viewModel);
    }


    @Override
    public void showErrorMessage() {

    }

    @Override
    public void hideProgressBar() {

    }

    private void hide(View view) {
        view.setVisibility(View.INVISIBLE);
    }
}