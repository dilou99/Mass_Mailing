package com.example.email_editor_tester.mailSender.service;

import javax.mail.MessagingException;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String htmlBody) throws MessagingException;
}
