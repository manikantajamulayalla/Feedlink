package com.FeedLink.MiniProject.Service;

import com.FeedLink.MiniProject.Entity.Feedback;
import com.FeedLink.MiniProject.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }
}
