package com.proj2.q2;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {

    private final RestTemplate restTemplate;

    public MyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getDataFromWebService() {
        String url = "https://api.example.com/data";
        return restTemplate.getForObject(url, String.class);
    }
}
