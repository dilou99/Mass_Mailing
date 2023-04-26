package com.example.email_editor_tester.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonService {

    private final JsonRepository jsonRepository;

    @Autowired
    public JsonService(JsonRepository jsonRepository) {
        this.jsonRepository = jsonRepository;
    }

    public List<json> getJson() {
        return jsonRepository.findAll();
    }

    public json findById(Long id) {
        return jsonRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "json with id " + id + " does not exist"));
    }
}
