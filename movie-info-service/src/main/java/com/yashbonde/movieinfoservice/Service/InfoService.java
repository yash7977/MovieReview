package com.yashbonde.movieinfoservice.Service;

import com.yashbonde.movieinfoservice.Model.Movie;

public interface InfoService {
     Movie getMovieInfo(String name);

     Movie addMovieInfo(Movie movie);

     Movie findById(Long id);
}
