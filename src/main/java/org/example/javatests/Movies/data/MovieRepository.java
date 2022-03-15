package org.example.javatests.Movies.data;

import org.example.javatests.Movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void savoOrUpdate(Movie movie);
}
