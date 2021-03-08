package com.yashbonde.movieinfoservice.Service.impl;

import com.yashbonde.movieinfoservice.Model.Movie;
import com.yashbonde.movieinfoservice.Service.InfoService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InfoServiceImpl implements InfoService {
    Map<String,Movie> map = new HashMap<>();
    @Override
    public Movie getMovieInfo(String name) {
        if(!map.containsKey(name)){
            return null;
        }else{
            return map.get(name);
        }
    }

    @Override
    public Movie addMovieInfo(Movie movie) {
        if(this.map.containsKey(movie.getMovieName())){
            return null;
        }else {
            movie.setId(Long.valueOf(map.size()));
            map.put(movie.getMovieName(), movie);
            return movie;
        }
    }

    @Override
    public Movie findById(Long id) {
        Movie movie = null;
        for(String key:map.keySet()){
            if(map.get(key).getId() == id){
                movie = map.get(key);
            }
        }
        return movie;
    }
}
