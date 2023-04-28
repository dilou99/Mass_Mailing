package com.example.email_editor_tester.templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {
    private final TemplateRepository templateRepository;

    @Autowired
    public TemplateService(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    public List<Template> getTemplates() {
        return templateRepository.findAll();
    }

    public Template getTemplate(Long id) {
        return templateRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                "template with id " + id + " does not exist"));
    }

    public void addNewTemplate(Template template) {

        templateRepository.save(template);
    }

    public void deleteTemplate(Long templateId) {
        boolean exists = templateRepository.existsById(templateId);
        if (!exists) {
            throw new IllegalStateException("Template with id " + templateId + " does not exist");
        }
        templateRepository.deleteById(templateId);
    }

    public Template updateTemplate(Long id,Template template) {
        Template templateToUpdate = templateRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "Template with id " + template.getId() + " does not exist"));

        templateToUpdate.setName(template.getName());
        templateToUpdate.setHtmlData(template.getHtmlData());
        templateToUpdate.setJsonData(template.getJsonData());

        Template savedTemplate = templateRepository.save(templateToUpdate);
        return savedTemplate;

    }
}
