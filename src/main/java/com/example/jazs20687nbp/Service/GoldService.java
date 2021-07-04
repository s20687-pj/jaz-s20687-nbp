package com.example.jazs20687nbp.Service;

import com.example.jazs20687nbp.Model.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    public double getAverage(String dateStart, String DateKoniec) throws JsonProcessingException {

        final ObjectMapper mapper = new ObjectMapper();
        String url = "http://api.nbp.pl/api/cenyzlota/" + dateStart +"/" + DateKoniec;
        String jsonString = restTemplate.getForObject(url, String.class);
        List<Root> list = mapper.readValue(jsonString, new TypeReference<List<Root>>(){});

        double whole =0;
        for(Root rat :list){
            whole += rat.getCena();
        }
        double srednia = whole/list.size();
        return srednia;

    }
}
