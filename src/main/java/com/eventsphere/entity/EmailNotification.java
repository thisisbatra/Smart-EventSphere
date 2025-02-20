package com.eventsphere.entity;


import com.eventsphere.enums.ApplicationStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "email_notifications")
public class EmailNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User recipient;  // User who receives the email.

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false, length = 5000)
    private String body;

    @Column(nullable = false)
    private LocalDateTime sentAt = LocalDateTime.now();



//    private Long userId;
//
//    private Long applicationId;
//
//    private ApplicationStatus applicationStatus;
//
//    private LocalDateTime timeStamp;
}
