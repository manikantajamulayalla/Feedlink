package com.FeedLink.MiniProject.Controllers;



import com.FeedLink.MiniProject.Entity.User;
import com.FeedLink.MiniProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register") // Base path for registration endpoint
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUser(@RequestBody User user) {
        System.out.println("Received User: " + user); // Debugging log to check received data
        return userService.registerUser(user);
    }
}
