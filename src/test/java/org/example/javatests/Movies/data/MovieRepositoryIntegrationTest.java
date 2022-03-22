package org.example.javatests.Movies.data;

import org.example.javatests.Movies.model.Movie;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.example.javatests.Movies.model.Genre.*;
import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {

    private MovieRepositoryJdbc movieRepository;
    private DataSource dataSource;

    @Before
    public void setUp() throws Exception {
        dataSource =
                new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(),new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void insert_move_to_db() {

        Movie movie = new Movie("Super 8", 120 , THRILLER);

        movieRepository.savoOrUpdate(movie);

        Movie movieLoaded = movieRepository.findById(4);

        assertEquals(movieLoaded, new Movie(4,"Super 8", 120 , THRILLER));
    }

    @Test
    public void load_all_movies() throws SQLException {


        Collection<Movie> movies = movieRepository.findAll();

        assertEquals(movies, Arrays.asList(
                new Movie(1,"Dark Knight", 152, ACTION),
                new Movie(2,"Memento", 113, THRILLER),
                new Movie(3,"Matrix", 136, ACTION)
        ));

    }

    @Test
    public void load_movies_by_ID() {
        Movie movie = movieRepository.findById(2);

        assertEquals(movie, new Movie(2,"Memento", 113, THRILLER));
    }

    @After
    public void tearDown() throws Exception {

        Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");

    }
}