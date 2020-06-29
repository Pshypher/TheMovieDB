
package com.example.android.moviedbapplication.tmdbapi.toprated;

import java.util.ArrayList;
import java.util.List;

import com.example.android.moviedbapplication.data.Movie;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopRated {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public List<Movie> parse() {
        ArrayList<Movie> movies = new ArrayList<>();
        for (Result result : results) {
            long id = result.getId();
            String title = result.getTitle();
            movies.add(new Movie(id, title, getClass().getName()));
        }
        return movies;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
