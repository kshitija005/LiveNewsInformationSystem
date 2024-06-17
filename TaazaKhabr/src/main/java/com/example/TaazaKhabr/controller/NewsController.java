package com.example.TaazaKhabr.controller;

import com.example.TaazaKhabr.dto.NewsResponce;
import com.example.TaazaKhabr.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController
{
    @Autowired
    NewsService newsService;

    @GetMapping("/get")
    public NewsResponce getNews(@RequestParam("country") String country,
                                @RequestParam("apikey") String apikey)
    {
        return newsService.getNews(country,apikey);
    }
}
