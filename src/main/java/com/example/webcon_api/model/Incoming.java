package com.example.webcon_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "incoming")
public class Incoming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mailer_name", nullable = false)
    private String mailerName;

    @Column(name = "message_id", nullable = false)
    private String messageId;

    @Column(name = "delivery", nullable = false)
    private Integer delivery = 1;

    @Column(name = "processed", nullable = false)
    private Integer processed = 0;

    @Column(name = "message", nullable = false)
    private String message;

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMailerName() {
        return mailerName;
    }

    public void setMailerName(String mailerName) {
        this.mailerName = mailerName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getProcessed() {
        return processed;
    }

    public void setProcessed(Integer processed) {
        this.processed = processed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
