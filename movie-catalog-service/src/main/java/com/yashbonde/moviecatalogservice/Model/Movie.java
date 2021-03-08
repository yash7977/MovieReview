package com.yashbonde.moviecatalogservice.Model;

public class Movie {

    private Long id;
    private String movieName;
    private String description;


    public Movie() {
    }

    public Movie(Long id, String movieId, String name) {
        this.id = id;
        this.movieName = movieId;
        this.description = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
