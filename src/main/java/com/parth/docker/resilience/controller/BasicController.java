package com.parth.docker.resilience.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {

    @GetMapping(value = {"/hello"})
    public ResponseEntity testEndpoint() {
        return  ResponseEntity.accepted().build();
    }


}
