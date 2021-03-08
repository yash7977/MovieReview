package com.yashbonde.moviecatalogservice.Service;

import com.yashbonde.moviecatalogservice.Model.User;

public interface CatalogService {
    public User addUser(User user);
    public User getuser(String userName);
}
