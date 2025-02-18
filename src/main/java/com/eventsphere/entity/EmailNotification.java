package com.eventsphere.entity;


import com.eventsphere.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Email_Notification")
public class EmailNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long applicationId;

    private Status status;

    private LocalDateTime timeStamp;
}
