package com.yashbonde.movieinfoservice.Api;


import com.yashbonde.movieinfoservice.Model.Movie;
import com.yashbonde.movieinfoservice.Service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/movies")
public class Resouce {

    @Autowired
    InfoService infoService;

    @GetMapping("/getMovie")
    public Movie getMovieInfo(@RequestParam String movieName){
        return infoService.getMovieInfo(movieName);
    }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return infoService.addMovieInfo(movie);
    }

    @GetMapping("/getMovieById")
    public Movie getMovieInfo(@RequestParam Long id){
        return infoService.findById(id);
    }
}
