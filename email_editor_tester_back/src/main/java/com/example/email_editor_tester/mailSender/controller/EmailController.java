package com.example.email_editor_tester.mailSender.controller;

import com.example.email_editor_tester.mailSender.resource.EmailMessage;
import com.example.email_editor_tester.mailSender.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping(path="api/v1/email")
public class EmailController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping()
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage) throws MessagingException {
        this.emailSenderService.sendEmail(emailMessage.getTo(),emailMessage.getSubject(),emailMessage.getHtmlBody());
        return ResponseEntity.ok("success");
    }
}
