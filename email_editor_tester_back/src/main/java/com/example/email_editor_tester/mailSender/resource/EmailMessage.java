package com.example.email_editor_tester.mailSender.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailMessage {
    private String to;
    private String subject;
    @Lob
    private String htmlBody;

}
