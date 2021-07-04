package com.example.jazs20687nbp.Controller;

import com.example.jazs20687nbp.Model.Root;
import com.example.jazs20687nbp.Service.GoldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private GoldService goldService;

    public Controller(GoldService goldService) {
        this.goldService = goldService;
    }

    @GetMapping("/nbp")
    public ResponseEntity <List<Root>> api (){
        return ResponseEntity.ok(goldService.getGoldPrices());
    }


}
