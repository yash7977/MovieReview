package com.yashbonde.moviecatalogservice.Service.Imp;

import com.yashbonde.moviecatalogservice.Model.Movie;
import com.yashbonde.moviecatalogservice.Model.User;
import com.yashbonde.moviecatalogservice.Service.CatalogService;
import com.yashbonde.moviecatalogservice.Service.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    Util restTemplate;

    @Override
    public User addUser(User user) {
        String url = "http://localhost:8080/user/addUser";
        HttpHeaders headers = restTemplate.getHttpHeaders();
        HttpEntity<User> entity = new HttpEntity<>(user, headers);
        return restTemplate.getRestTemplate().postForObject(url, entity, User.class);
    }

    @Override
    public User getuser(String userName) {
        return restTemplate.getRestTemplate().getForObject("http://localhost:8080/user/getUser/?userName="+userName,User.class);
    }

    @Override
    public Movie getMovie(String movieName) {
        return restTemplate.getRestTemplate().getForObject("http://localhost:8082/movies/getMovie/?movieName="+movieName,Movie.class);
    }

    @Override
    public Movie addMovie(Movie movie) {
        String url = "http://localhost:8082/movies/addMovie";
        HttpHeaders headers = restTemplate.getHttpHeaders();
        HttpEntity<Movie> entity = new HttpEntity<>(movie, headers);
        return restTemplate.getRestTemplate().postForObject(url, entity, Movie.class);
    }

    @Override
    public Movie findById(Long id) {
        return restTemplate.getRestTemplate().getForObject("http://localhost:8082/movies/getMovieById/?id="+id,Movie.class);
    }
}
