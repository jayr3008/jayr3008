package com.projects.contacts.controller;
import com.projects.contacts.repository.ContactRepository;
import com.projects.contacts.model.Contact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping("/add")
    public String saveContact(@RequestBody Contact c) { 
    	contactRepository.save(c);
        return "Added Contact id "+ c.getId();
    }

    @GetMapping("/find/{id}")

    public Optional<Contact> getContact(@PathVariable int id) {

        logger.info("find contact by id : "+id);
        Optional<Contact> con = contactRepository.findById(id);

        return con;
    }

    @GetMapping("/all")

    public List<Contact> getAllContacts() {

        List<Contact> allContacts = contactRepository.findAll();

        return allContacts;
    }

    @DeleteMapping("/delete/{id}")

    public String deleteContact(@PathVariable int id) {

        contactRepository.deleteById(id);

        return "Delete contact for id " + id;
    }

    @PutMapping("/update")

    public String updateContact(@RequestBody Contact c) {

        contactRepository.save(c);

        return "Updated contact for id " ;//+ c.getId();
    }

}
