package com.women.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.women.demo.model.Contact;
import com.women.demo.repository.ContactRepository;

@RestController
@CrossOrigin
public class ContactController {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @PostMapping("/contacts")
    public String addContact(@RequestBody Contact contact) {
        try {
            contactRepository.save(contact);
            return "Message sent successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send message";
        }
    }
}
