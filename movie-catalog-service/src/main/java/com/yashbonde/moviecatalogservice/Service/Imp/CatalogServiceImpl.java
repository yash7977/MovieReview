package com.yashbonde.moviecatalogservice.Service.Imp;

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

        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));



        // build the request
        HttpEntity<User> entity = new HttpEntity<>(user, headers);

        // send POST request
        return restTemplate.getRestTemplate().postForObject(url, entity, User.class);
    }

    @Override
    public User getuser(String userName) {
        return restTemplate.getRestTemplate().getForObject("http://localhost:8080/user/getUser/?userName="+userName,User.class);
    }
}
