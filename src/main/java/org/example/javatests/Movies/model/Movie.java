package org.example.javatests.Movies.model;

public class Movie {

    private Integer iD;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(String name, int minutes, Genre genre) {
        this( null, name, minutes, genre);
    }

    public Movie(Integer iD, String name, int minutes, Genre genre) {
        this.iD = iD;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }
}
