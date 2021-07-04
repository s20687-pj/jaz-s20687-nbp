package com.example.jazs20687nbp.Controller;

import com.example.jazs20687nbp.Model.Root;
import com.example.jazs20687nbp.Service.GoldService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private GoldService goldService;

    public Controller(GoldService goldService) {
        this.goldService = goldService;
    }

    @ApiOperation(value = "pobierz średnia cene złota z zakresu dni", notes = "podaj date poczatkowa i koncowa")
    @GetMapping("/nbp2/{from}/{to}")
    public ResponseEntity <Double> api2 (@ApiParam(value = "Data początek",
            example = "2012-05-05") @PathVariable String from, @ApiParam(value = "Data koniec",
            example = "2012-05-07")  @PathVariable String to) throws JsonProcessingException {
        return ResponseEntity.ok(goldService.getAverage(from,to));
    }


}
