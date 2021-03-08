package com.yashbonde.moviedataservice.Service;

import com.yashbonde.moviedataservice.Model.Rating;

import java.util.List;

public interface MovieDataService {
    public Rating addRating(Rating rating);
    public List<Rating> getRating(Long userId);
}
