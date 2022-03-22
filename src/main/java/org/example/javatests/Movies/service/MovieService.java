package org.example.javatests.Movies.service;

import org.example.javatests.Movies.data.MovieRepository;
import org.example.javatests.Movies.model.Genre;
import org.example.javatests.Movies.model.Movie;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLenght(int lenght) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= 120).collect(Collectors.toList());
    }
}

