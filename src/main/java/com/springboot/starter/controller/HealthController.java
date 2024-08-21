package com.springboot.starter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HealthController {

    @GetMapping(path = "/health" )
    public ResponseEntity health()  {
        return ResponseEntity.ok().body("OK");
    }
}
