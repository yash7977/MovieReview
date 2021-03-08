package com.yashbonde.moviecatalogservice.Api;

import com.yashbonde.moviecatalogservice.Model.CatalogItem;
import com.yashbonde.moviecatalogservice.Model.Movie;
import com.yashbonde.moviecatalogservice.Model.User;
import com.yashbonde.moviecatalogservice.Service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private CatalogService catalogService;


    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return catalogService.addUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("userName") String userName){
        return catalogService.getuser(userName);
    }


    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie){
        return catalogService.addMovie(movie);
    }

    @GetMapping("/getMovie")
    public Movie getMovie(@RequestParam String movieName){
        return catalogService.getMovie(movieName);
    }

    @GetMapping("/getMovieById")
    public Movie findById(Long id){
        return catalogService.findById(id);
    }
}
