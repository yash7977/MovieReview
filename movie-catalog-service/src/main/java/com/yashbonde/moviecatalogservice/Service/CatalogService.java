package com.yashbonde.moviecatalogservice.Service;

import com.yashbonde.moviecatalogservice.Model.Movie;
import com.yashbonde.moviecatalogservice.Model.User;

public interface CatalogService {
    public User addUser(User user);
    public User getuser(String userName);

    public Movie getMovie(String movieName);
    public Movie addMovie(Movie movie);
    public Movie findById(Long id);
}
