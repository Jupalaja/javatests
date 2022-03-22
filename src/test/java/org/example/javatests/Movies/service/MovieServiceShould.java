package org.example.javatests.Movies.service;
import static org.assertj.core.api.Assertions.assertThat;  // main one
import org.example.javatests.Movies.data.MovieRepository;
import org.example.javatests.Movies.model.Genre;
import org.example.javatests.Movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;
import static org.example.javatests.Movies.model.Genre.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;

public class MovieServiceShould {


    MovieService movieService;
    @Before
    public void setUp() throws Exception {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                asList(
                        new Movie(1,"a",60,ACTION),
                        new Movie(2,"b",180,THRILLER),
                        new Movie(3,"c",120,ACTION)
                )
    
        );
        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.ACTION);
        assertEquals(getMovieIDs(movies),(asList(1,3)));

    }
    @NotNull
    private List<Integer> getMovieIDs(Collection<Movie> movies) {
        List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
        return movieIds;
    }
    @Test
    public void return_movies_by_lenght() {
        Collection<Movie> movies = movieService.findMoviesByLenght(120);
        assertEquals(getMovieIDs(movies),(asList(1,3)));

    }
}