package com.example.email_editor_tester.contacts;

import com.example.email_editor_tester.gallery.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/contact")
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping
    public List<Contact> getAllContact() {
        return contactService.getAllContacts();
    }

    @GetMapping("{id}")
    public Contact getContact(@PathVariable Long id) {
        return contactService.getContact(id);
    }

}
