package com.bipuz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Me {

    @GetMapping("/")
    public String giveMe() {

        return "index";
    }
    @ResponseBody
    @GetMapping("hell")
    public String hellMe() {

        return "hell yeah";
    }
}
