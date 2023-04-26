package com.example.email_editor_tester.templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/template")
public class TemplateController {
    private final TemplateService templateService;

    @Autowired
    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @GetMapping
    public List<Template> getTemplates() {
        return templateService.getTemplates();
    }

    @GetMapping("{id}")
    public Template getTemplate(@PathVariable Long id) {
        return templateService.getTemplate(id);
    }

    @PostMapping
    public void registerNewTemplate(@RequestBody Template template) {
        templateService.addNewTemplate(template);
    }

    @DeleteMapping(path = "{templateId}")
    public void deleteTemplate(@PathVariable("templateId") Long templateId) {
        templateService.deleteTemplate(templateId);
    }

    @PutMapping(path = "{templateId}")
    public void updateTemplate(
            @PathVariable("templateId") Long templateId,
            @RequestBody Template template
    ) {
        templateService.updateTemplate(template);
    }

}
