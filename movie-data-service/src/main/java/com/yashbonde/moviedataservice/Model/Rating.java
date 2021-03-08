package com.yashbonde.moviedataservice.Model;

public class Rating {
    private Long movieId;
    private int rating;
    private Long userId;

    public Rating() {
    }

    public Rating(Long movieId, int rating, Long userId) {
        this.movieId = movieId;
        this.rating = rating;
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
