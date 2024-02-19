package com.example.DZ_Spring4.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;

@Controller
public class NumController {
    @GetMapping("/num")
    public int numGrand(Model model){
        int num = 34;
        model.addAllAttributes(Collections.singleton("number"));
        return num;
    }

}
