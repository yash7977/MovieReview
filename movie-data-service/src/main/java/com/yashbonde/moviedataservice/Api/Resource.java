package com.yashbonde.moviedataservice.Api;

import com.yashbonde.moviedataservice.Model.Rating;
import com.yashbonde.moviedataservice.Service.MovieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class Resource {

    @Autowired
    MovieDataService movieDataService;

    @GetMapping("/getRatings")
    public List<Rating> getMovieRating(@RequestParam Long userId) {
        return movieDataService.getRating(userId);
    }

    @PostMapping("/addRating")
    public Rating addRating(@RequestBody Rating rating){
        return movieDataService.addRating(rating);
    }

}
