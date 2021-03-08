package com.yashbonde.moviecatalogservice.Service;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
public class Util {

    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    public HttpHeaders getHttpHeaders(){
        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
         return headers;
    }
}
