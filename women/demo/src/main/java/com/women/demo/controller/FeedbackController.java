package com.women.demo.controller;

import com.women.demo.Entity.Feedback;
import com.women.demo.Repositary.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @PostMapping("/feedback")
    public String submitFeedback(@RequestBody Feedback feedback) {
        feedbackRepository.save(feedback);
        return "Feedback submitted successfully!";
    }
}
