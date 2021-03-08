package com.yashbonde.moviedataservice.Service.Imp;

import com.yashbonde.moviedataservice.Model.Rating;
import com.yashbonde.moviedataservice.Service.MovieDataService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieDataServiceImpl implements MovieDataService {
    Map<Long,Rating> map = new HashMap<>();
    @Override
    public Rating addRating(Rating rating) {
        if(map.containsKey(rating.getMovieId())){
            return null;
        }else{
            map.put(rating.getMovieId(),rating);
        }
        return rating;
    }

    @Override
    public List<Rating> getRating(Long userId) {
        List<Rating> ratings=new ArrayList<>();

        for(Long key:map.keySet()){
            if(map.get(key).getUserId()==userId){
                ratings.add(map.get(key));
            }
        }
        return ratings;
    }
}
