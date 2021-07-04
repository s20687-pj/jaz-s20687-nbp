package com.example.jazs20687nbp.Service;

import com.example.jazs20687nbp.Model.Root;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GoldService {

    private RestTemplate restTemplate;

    public GoldService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Root> getGoldPrices() {
        List<Root> rates = restTemplate.getForObject("http://api.nbp.pl/api/cenyzlota/2013-01-01/2013-01-31/", List.class);
        return rates;
    }
}
