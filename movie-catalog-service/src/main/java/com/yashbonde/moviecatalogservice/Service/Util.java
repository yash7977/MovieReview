package com.yashbonde.moviecatalogservice.Service;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class Util {

    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
