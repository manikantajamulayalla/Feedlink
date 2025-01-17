package com.FeedLink.MiniProject.Controllers;

import com.FeedLink.MiniProject.Entity.User;
import com.FeedLink.MiniProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = "application/x-www-form-urlencoded")
    public String registerUser(@ModelAttribute User user) {
        return userService.registerUser(user);
    }
}