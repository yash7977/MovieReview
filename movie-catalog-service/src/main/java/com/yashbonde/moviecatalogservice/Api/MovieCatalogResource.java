package com.yashbonde.moviecatalogservice.Api;

import com.yashbonde.moviecatalogservice.Model.CatalogItem;
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

    @RequestMapping("/{userId}")
    public List<CatalogItem> getMovies(@PathVariable("userId") String userId){
        return Collections.singletonList(
                new CatalogItem("Transformers","Test",4)
        );

    }


    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return catalogService.addUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("userName") String userName){
        return catalogService.getuser(userName);
    }
}
