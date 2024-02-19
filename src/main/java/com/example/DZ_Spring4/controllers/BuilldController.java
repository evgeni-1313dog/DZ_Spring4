package com.example.DZ_Spring4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuilldController {
    @GetMapping("/bi")
    public String about() {

        return "builld.html";
    }

}
