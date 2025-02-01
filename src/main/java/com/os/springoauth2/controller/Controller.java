package com.os.springoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    public String home()
    {
        return "Home!";
    }
    @GetMapping("/secured")
    public String secured()
    {
        return "Secured!";
    }
}
