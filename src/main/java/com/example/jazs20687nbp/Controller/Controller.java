package com.example.jazs20687nbp.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/nbp")
    public ResponseEntity<String> api (){
        return ResponseEntity.ok("jest ok");
    }
}
