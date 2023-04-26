package com.example.email_editor_tester.gallery;

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

    public List<Json> getAllJsons() {
        return jsonRepository.findAll();
    }

    public Json getJson(Long id) {
        return jsonRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "json with id " + id + " does not exist"));
    }
}
