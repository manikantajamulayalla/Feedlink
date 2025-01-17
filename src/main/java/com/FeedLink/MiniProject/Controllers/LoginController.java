package com.FeedLink.MiniProject.Controllers;


import com.FeedLink.MiniProject.Entity.User;
import com.FeedLink.MiniProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        // Validate user
        User user = userService.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            // Redirect to index page if login is successful
            return "redirect:/index.html";
        } else {
            // Add error message and return to login page
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }
}

