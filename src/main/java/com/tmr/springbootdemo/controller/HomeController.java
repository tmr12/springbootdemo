package com.tmr.springbootdemo.controller;

import com.tmr.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    //@RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("333");
        user.setName("Madhava");
        user.setEmail("madhavarao.mrt@gmail.com");
        return user;
    }
}
