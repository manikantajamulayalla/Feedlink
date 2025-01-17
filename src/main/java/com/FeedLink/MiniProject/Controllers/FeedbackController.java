package com.FeedLink.MiniProject.Controllers;

import com.FeedLink.MiniProject.Entity.Feedback;
import com.FeedLink.MiniProject.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/submit")
    public ResponseEntity<String> submitFeedback(@RequestBody Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return ResponseEntity.ok("Feedback submitted successfully");
    }
}
