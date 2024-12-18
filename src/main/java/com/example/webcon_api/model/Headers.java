package com.example.webcon_api.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "headers")
public class Headers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "received", nullable = false)
    private LocalDateTime received;

    @Column(name = "\"from\"", nullable = false)
    private String from;

    @Column(name = "\"to\"", nullable = false)
    private String to;

    @Column(name = "subject")
    private String subject;

    @Column(name = "body_id", nullable = false)
    private Long bodyId;

    public LocalDateTime getReceived() {
        return received;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public Long getBodyId() {
        return bodyId;
    }
}
