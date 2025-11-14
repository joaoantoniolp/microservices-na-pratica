package com.ms.email.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.UUID;

public class EmailDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID userId;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

    // Getters e Setters

    public UUID getUserId() { return userId; }

    public void setUserId(UUID userId) { this.userId = userId; }

    public String getEmailTo() { return emailTo; }

    public void setEmailTo(String emailTo) { this.emailTo = emailTo; }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }
}