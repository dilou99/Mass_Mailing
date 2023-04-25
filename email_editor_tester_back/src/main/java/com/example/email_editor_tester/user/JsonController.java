package com.example.email_editor_tester.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/json")
public class JsonController {

    private final JsonService jsonService;
    @Autowired
    public JsonController(JsonService jsonService) {
        this.jsonService = jsonService;
    }

    @GetMapping
    public List<json> getAllJson() {
        return jsonService.getJson();
    }

    @GetMapping("{id}")
    public json getJson(@PathVariable Long id) {
        return jsonService.findById(id);
    }


}
