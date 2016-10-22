package com.leogen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebPageController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMainPage() {
        return "main.html";
    }
}
