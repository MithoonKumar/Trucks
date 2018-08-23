package com.example.Trucks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TruckController {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    @ResponseBody
    public String testMethod () {
        return "test string";
    }
}
