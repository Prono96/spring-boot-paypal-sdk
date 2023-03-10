package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PaypalController {
    @Autowired
    PaypalService service;
    @GetMapping("/")
    public String home() {
        return "home";
    }

//    public String payment(@ModelAttribute("order") Order order) {
//        service.createPayment()
//    }
}
