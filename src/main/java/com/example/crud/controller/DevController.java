package com.example.crud.controller;

import com.example.crud.repo.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

    @Autowired
    DeveloperRepo developerRepo;

    @GetMapping("/hello")
    public String hello(){
        return "Ahmad";
    }
}
