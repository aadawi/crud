package com.example.crud.controller;

import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "test",produces = MediaType.APPLICATION_JSON_VALUE)
    public Test test(){
        return new Test();
    }

    @Data
    class Test {
        private String name = "Ahmad ";
        private String age = "30";
    }

}
