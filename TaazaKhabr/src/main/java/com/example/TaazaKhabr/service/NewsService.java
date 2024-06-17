package com.example.TaazaKhabr.service;

import com.example.TaazaKhabr.dto.NewsResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class NewsService
{
    @Autowired
    RestTemplate restTemplate;

    public NewsResponce getNews(String country, String apikey)
    {
        String url = prepraeUrl(country, apikey);
        return restTemplate.getForObject(url, NewsResponce.class);
    }

    private String prepraeUrl(String country,
                              String apikey)
    {
        return "https://newsapi.org/v2/top-headlines?country=" + country + "&apiKey=" + apikey;
    }
}
