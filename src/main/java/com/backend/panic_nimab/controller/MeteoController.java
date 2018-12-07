package com.backend.panic_nimab.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class MeteoController
{
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value="/meteo",method = RequestMethod.GET)
    public String getMeteo()
    {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.set("HTTP/1.1", "default,activationTimes");
        HttpEntity<?> entity = new HttpEntity<>(httpHeaders);

        return restTemplate.exchange("http://dataservice.accuweather.com/forecasts/v1/daily/1day/136555?apikey=Yaaw8hivIngiUG9mVRlxcDXVcVqGypWB&language=fr&details=false",
                HttpMethod.GET,entity, String.class).getBody();
    }
}
