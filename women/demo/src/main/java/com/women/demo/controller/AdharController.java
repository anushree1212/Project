package com.women.demo.Controller;

import com.women.demo.Entity.Adhar;
import com.women.demo.Repository.AdharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AdharController {
    @Autowired
    private AdharRepository adharRepository;

    @PostMapping("/adhar")
    public Adhar registerStudent(@RequestBody Adhar adhar) {
        return adharRepository.save(adhar);
    }
}