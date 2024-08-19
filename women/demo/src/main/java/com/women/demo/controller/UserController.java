package com.women.demo.controller;// UserController.java
import com.women.demo.Repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> submitForm(@RequestBody com.women.demo.Entity.User user) {
        try {
            userRepository.save(user);
            return new ResponseEntity<>("Data submitted successfully!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error submitting data.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
