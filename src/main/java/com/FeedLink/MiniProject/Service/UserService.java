package com.FeedLink.MiniProject.Service;


import com.FeedLink.MiniProject.Entity.User;
import com.FeedLink.MiniProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user) {
        try {
            userRepository.save(user);
            return "User registered successfully!";
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
            return "Error: " + e.getMessage();
        }
    }


    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    public User findById(Long userId) {
        return null;
    }
}


