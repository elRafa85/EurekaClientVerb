package com.example.lab4verb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class WordController {

    @Value("${words}")
    String words;

    @GetMapping("/")
    public @ResponseBody String getWords(){
        String[] listOfWords = words.split(",");
        return Arrays.stream(listOfWords).findAny().get();
    }

}
