package org.example.javatests.Movies.service;
import org.example.javatests.Movies.data.MovieRepository;
import org.example.javatests.Movies.model.Genre;
import org.example.javatests.Movies.model.Movie;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;
import static org.example.javatests.Movies.model.Genre.*;
import static org.junit.Assert.assertEquals;

public class MovieServiceShould {

    MovieService movieService;
    @Before
    public void setUp() throws Exception {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(
                asList(
                        new Movie(1,"Superman",135,ACTION, "Cameron"),
                        new Movie(2,"Super 8",179,THRILLER,"Spielberg"),
                        new Movie(3,"The Darkest Hour",120,DRAMA,"Wright"),
                        new Movie(4,"Dark Knight", 152, ACTION,"Nolan"),
                        new Movie(5,"Memento", 113, THRILLER,"Cameron"),
                        new Movie(6,"Matrix", 136, ACTION,"Wachowskis")
            ));
        movieService = new MovieService(movieRepository);
    }

    @Test
    public void return_movies_by_genre() {

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.ACTION);
        assertEquals(getMovieIDs(movies),(asList(1,4,6)));

    }
    @NotNull
    private List<Integer> getMovieIDs(Collection<Movie> movies) {
        List<Integer> movieIds = movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());
        return movieIds;
    }
    @Test
    public void return_movies_by_length() {
        Collection<Movie> movies = movieService.findMoviesByLength(120);
        assertEquals(getMovieIDs(movies),(asList(3,5)));
    }
    @Test
    public void return_movies_by_name() {
        Collection<Movie> movies = movieService.findMoviesByName("super");
        assertEquals(getMovieIDs(movies),(asList(1,2)));
    }
    @Test
    public void return_movies_by_director() {
        Collection<Movie> movies = movieService.findMoviesByDirector("Spielberg");
        assertEquals(getMovieIDs(movies),(asList(2)));
    }
}