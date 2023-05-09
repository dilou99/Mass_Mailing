package com.example.email_editor_tester.contacts;

import com.example.email_editor_tester.gallery.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact getContact(Long id) {
        return contactRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "json with id " + id + " does not exist"));
    }
}
