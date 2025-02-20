package com.eventsphere.entity;


import com.eventsphere.enums.Role;
import com.eventsphere.enums.ApplicationStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long eventId;

    private Role role;

    private ApplicationStatus applicationStatus;

    private JSONPObject jsonpObject;

    private LocalDateTime timeStamp;

}
